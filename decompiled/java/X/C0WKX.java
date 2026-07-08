package X;

import Y.ARunnableS113S0100000_13;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import dtj.u7;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0WKX, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WKX extends C0WKY {
    public static boolean LJIIJJI;
    public final long LIZIZ;
    public final HashSet<String> LIZJ;
    public final LinkedHashMap<String, C0WKW> LIZLLL;
    public final ConcurrentHashMap<String, String> LJ;
    public final ConcurrentHashMap<String, Long> LJFF;
    public final ReentrantReadWriteLock.ReadLock LJI;
    public final ReentrantReadWriteLock.WriteLock LJII;
    public volatile float LJIIIIZZ;
    public final ARunnableS113S0100000_13 LJIIIZ;
    public final BPEAHandler LJIIJ;

    public static void LIZIZ(Set set) {
        Object c098200Yq;
        Keva repo = Keva.getRepo("music_repo");
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            String str = (String) it2.next();
            try {
                repo.erase(str);
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                C830690WiJ c830690WiJ = C830690WiJ.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("delete local music id failed, musicId = ");
                sbLIZ.append(str);
                C201955140j.LJIIIIZZ(c830690WiJ, "MusicDiskLruCache", C2188811AlT.LIZIZ(sbLIZ));
                C1AF0.LJ(thM5exceptionOrNullimpl);
            }
        }
    }

    public final void LIZJ(Set<String> set) {
        String str;
        if (!C300100BpY.LIZ()) {
            C201955140j.LIZIZ("ReuseCreationMusicUrlHook", "don't initMusicIdToLocalPathMap");
            return;
        }
        Keva repo = Keva.getRepo("music_repo");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Map<String, ?> all = repo.getAll();
        ArrayList<Map.Entry> arrayList = new ArrayList(all.size());
        Iterator<Map.Entry<String, ?>> it2 = all.entrySet().iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next());
        }
        for (Map.Entry entry : arrayList) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if ((value instanceof String) && (str = (String) value) != null && set.contains(str)) {
                this.LJ.put((String) key, new C0VSJ(this.LIZ, str).getAbsolutePath());
            } else {
                linkedHashSet.add(key);
            }
        }
        C201955140j.LIZIZ("ReuseCreationMusicUrlHook", "initMusicIdToLocalPathMap");
        LIZIZ(linkedHashSet);
    }

    public final long LJ(long j) {
        long length;
        String str;
        HashSet hashSet = new HashSet();
        this.LJII.lock();
        long j2 = 0;
        try {
            Iterator<Map.Entry<String, C0WKW>> it2 = this.LIZLLL.entrySet().iterator();
            length = 0;
            while (it2.hasNext()) {
                try {
                    length += it2.next().getValue().LIZ.length();
                } catch (Throwable th) {
                    th = th;
                    j2 = length;
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            if (length <= j) {
                this.LJII.unlock();
                return 0L;
            }
            long j3 = (long) (j * this.LJIIIIZZ);
            HashSet hashSet2 = new HashSet();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("MusicDiskLruCache whiteMusicFilePathList: ");
            sbLIZ.append(this.LIZJ);
            C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            for (Map.Entry<String, C0WKW> entry : this.LIZLLL.entrySet()) {
                String key = entry.getKey();
                C0WKW value = entry.getValue();
                if (value.LIZ.exists()) {
                    if (!this.LIZJ.contains(value.LIZ.getPath())) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("MusicDiskLruCache music cache file: ");
                        sbLIZ2.append(value.LIZ.getName());
                        sbLIZ2.append(" add -tmp");
                        C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
                        long length2 = value.LIZ.length();
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append(value.LIZ.getAbsolutePath());
                        sbLIZ3.append("-tmp");
                        C0VSJ c0vsj = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ3));
                        if (value.LIZ.renameTo(c0vsj)) {
                            hashSet.add(c0vsj);
                            length -= length2;
                            try {
                                hashSet2.add(key);
                            } catch (Throwable th3) {
                                th = th3;
                                j2 = length;
                                TryCatchGuardChecker.doCheck(th);
                                this.LJII.unlock();
                                length = j2;
                            }
                        }
                    } else {
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("MusicDiskLruCache music cache file: ");
                        sbLIZ4.append(value.LIZ.getName());
                        sbLIZ4.append(" in  whiteMusicFilePathList");
                        C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ4));
                    }
                }
                if (length <= j3) {
                    break;
                }
            }
            Iterator it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                this.LIZLLL.remove((String) it3.next());
                if (C300100BpY.LIZ()) {
                    Keva repo = Keva.getRepo("music_repo");
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    Map<String, ?> all = repo.getAll();
                    ArrayList<Map.Entry> arrayList = new ArrayList(all.size());
                    Iterator<Map.Entry<String, ?>> it4 = all.entrySet().iterator();
                    while (it4.hasNext()) {
                        arrayList.add(it4.next());
                    }
                    for (Map.Entry entry2 : arrayList) {
                        String str2 = (String) entry2.getKey();
                        Object value2 = entry2.getValue();
                        if ((value2 instanceof String) && (str = (String) value2) != null && hashSet2.contains(str)) {
                            this.LJ.remove(str2);
                            linkedHashSet.add(str2);
                        }
                    }
                    LIZIZ(linkedHashSet);
                }
            }
            this.LJII.unlock();
            C823050WQl.LIZLLL().execute(new RunnableC514801zW(hashSet, 99));
            return length;
            TryCatchGuardChecker.doCheck(th);
            this.LJII.unlock();
            length = j2;
            C823050WQl.LIZLLL().execute(new RunnableC514801zW(hashSet, 99));
            return length;
        } catch (Throwable th4) {
            TryCatchGuardChecker.doCheck(th4);
            this.LJII.unlock();
            throw th4;
        }
    }

    public final void LIZ(String str, String str2) throws Throwable {
        long jLongValue;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cacheMusicFile fileName = ");
        sbLIZ.append(str);
        sbLIZ.append(", musicId = ");
        sbLIZ.append(str2);
        C201955140j.LIZIZ("ReuseCreationMusicUrlHook", C2188811AlT.LIZIZ(sbLIZ));
        if (str2 != null && C300100BpY.LIZ()) {
            this.LJ.put(str2, new C0VSJ(this.LIZ, str).getAbsolutePath());
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("cacheMusicFile success musicIdToLocalPathMap = ");
            sbLIZ2.append(this.LJ);
            C201955140j.LIZIZ("ReuseCreationMusicUrlHook", C2188811AlT.LIZIZ(sbLIZ2));
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C01MW(Keva.getRepo("music_repo"), str2, str, null), 3);
        }
        this.LJI.lock();
        C0WKW c0wkw = this.LIZLLL.get(str);
        if (c0wkw != null) {
            this.LIZJ.add(c0wkw.LIZ.getPath());
        }
        this.LJI.unlock();
        if (str != null && !a0.LJJJIL(str)) {
            Long l = this.LJFF.get(str);
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            if (System.currentTimeMillis() > jLongValue) {
                this.LJFF.put(str, Long.valueOf(System.currentTimeMillis()));
            }
            this.LJII.lock();
            C0VSJ c0vsj = new C0VSJ(this.LIZ, "journal");
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(str);
            sbLIZ3.append(' ');
            sbLIZ3.append(this.LJFF.get(str));
            sbLIZ3.append('\n');
            C09BH.LIZJ(c0vsj, C2188811AlT.LIZIZ(sbLIZ3), Charsets.UTF_8);
            this.LJII.unlock();
        }
        new C0VSJ(this.LIZ, str);
        if (c0wkw != null && c0wkw.LIZ != null) {
            return;
        }
        C0VSJ c0vsj2 = new C0VSJ(this.LIZ, str);
        C0WKW c0wkw2 = new C0WKW(c0vsj2, System.currentTimeMillis());
        this.LJII.lock();
        this.LIZLLL.put(str, c0wkw2);
        this.LIZJ.add(c0vsj2.getPath());
        this.LJII.unlock();
        if (((Number) C0ANF.LIZ.getValue()).intValue() == 0) {
            return;
        }
        this.LJIIJ.removeCallbacks(this.LJIIIZ);
        C786410Ut5.LJLIIL(10000L, this.LJIIJ, this.LJIIIZ);
    }

    public final long LIZLLL(long j, boolean z) {
        this.LJII.lock();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            Iterator<T> it2 = this.LIZLLL.entrySet().iterator();
            long j2 = 0;
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                if (System.currentTimeMillis() - ((C0WKW) entry.getValue()).LIZIZ > j) {
                    if (!this.LIZJ.contains(((C0WKW) entry.getValue()).LIZ.getPath())) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("MusicDiskLruCache  ");
                        sbLIZ.append((String) entry.getKey());
                        sbLIZ.append("  to be removed");
                        C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                        if (((C0WKW) entry.getValue()).LIZ.exists()) {
                            long length = ((C0WKW) entry.getValue()).LIZ.length();
                            if (((C0WKW) entry.getValue()).LIZ.delete()) {
                                linkedHashSet.add(entry.getKey());
                                j2 += length;
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("MusicDiskLruCache  ");
                                sbLIZ2.append((String) entry.getKey());
                                sbLIZ2.append("  removed");
                                C201955140j.LJIIL(C2188811AlT.LIZIZ(sbLIZ2));
                            }
                        } else {
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("MusicDiskLruCache  ");
                            sbLIZ3.append((String) entry.getKey());
                            sbLIZ3.append("  is not exist.");
                            C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ3));
                        }
                    } else {
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("MusicDiskLruCache  ");
                        sbLIZ4.append((String) entry.getKey());
                        sbLIZ4.append("   is in whiteMusicFilePathList.");
                        C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ4));
                    }
                }
            }
            if (z) {
                Iterator it3 = linkedHashSet.iterator();
                while (it3.hasNext()) {
                    this.LIZLLL.remove((String) it3.next());
                }
                if (C300100BpY.LIZ()) {
                    C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C01QX(null), 3);
                }
            }
            this.LJII.unlock();
            return j2;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LJII.unlock();
            throw th;
        }
    }

    public C0WKX(C0VSJ c0vsj, long j, HashSet hashSet) throws IOException {
        super(c0vsj);
        this.LIZIZ = j;
        this.LIZJ = hashSet;
        this.LIZLLL = new LinkedHashMap<>(0, 0.75f, true);
        this.LJ = new ConcurrentHashMap<>();
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.LJFF = new ConcurrentHashMap<>();
        this.LJI = reentrantReadWriteLock.readLock();
        this.LJII = reentrantReadWriteLock.writeLock();
        this.LJIIIIZZ = 0.5f;
        this.LJIIIZ = new ARunnableS113S0100000_13(this, 168);
        this.LJIIJ = new BPEAHandler(Looper.getMainLooper());
        if (c0vsj.exists() && c0vsj.isDirectory() && c0vsj.canRead() && c0vsj.canWrite()) {
            C823050WQl.LIZLLL().execute(new Runnable() { // from class: X.0WKU
                /* JADX WARN: Type inference incomplete: some casts might be missing */
                public final void LIZ() {
                    Long lPutIfAbsent;
                    C0WKX c0wkx = this.LL;
                    c0wkx.LJII.lock();
                    c0wkx.LJFF.clear();
                    try {
                        try {
                            C0VSJ c0vsj2 = new C0VSJ(c0wkx.LIZ, "journal");
                            long length = 0;
                            if (c0vsj2.exists()) {
                                Iterator it2 = ((ArrayList) C09BH.LJFF(c0vsj2)).iterator();
                                while (it2.hasNext()) {
                                    List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL((String) it2.next(), new String[]{" "}, 0, 6);
                                    if (listLJJLIIIJILLIZJL.size() == 2) {
                                        if ((!a0.LJJJIL((CharSequence) listLJJLIIIJILLIZJL.get(0))) && Long.parseLong((String) listLJJLIIIJILLIZJL.get(1)) >= 0) {
                                            if (c0wkx.LJFF.contains(listLJJLIIIJILLIZJL.get(0))) {
                                                Long l = c0wkx.LJFF.get(listLJJLIIIJILLIZJL.get(0));
                                                if (l == null) {
                                                    "accessedMap[strings[0]] should not be null".toString();
                                                    throw new IllegalArgumentException("accessedMap[strings[0]] should not be null");
                                                }
                                                if (Long.parseLong((String) listLJJLIIIJILLIZJL.get(1)) > l.longValue()) {
                                                    c0wkx.LJFF.put((String) listLJJLIIIJILLIZJL.get(0), Long.valueOf(Long.parseLong((String) listLJJLIIIJILLIZJL.get(1))));
                                                }
                                            } else {
                                                c0wkx.LJFF.put((String) listLJJLIIIJILLIZJL.get(0), Long.valueOf(Long.parseLong((String) listLJJLIIIJILLIZJL.get(1))));
                                            }
                                        }
                                    } else if (C1876910ywT.LIZIZ(listLJJLIIIJILLIZJL)) {
                                        String str = (String) listLJJLIIIJILLIZJL.get(1);
                                        Long lLJIILIIL = C2095008Iq.LJIILIIL((String) listLJJLIIIJILLIZJL.get(3));
                                        if (lLJIILIIL != null) {
                                            c0wkx.LJFF.put(str, lLJIILIIL);
                                        }
                                    }
                                }
                            }
                            File[] fileArrListFiles = c0wkx.LIZ.listFiles();
                            if (fileArrListFiles != null && fileArrListFiles.length != 0) {
                                ArrayList<C0WKW> arrayList = new ArrayList();
                                C089E c089e = new C089E(fileArrListFiles);
                                while (c089e.hasNext()) {
                                    File file = (File) c089e.next();
                                    if (file.isFile() && !Intrinsics.LJFF(file.getName(), "journal")) {
                                        ConcurrentHashMap<String, Long> concurrentHashMap = c0wkx.LJFF;
                                        String name = file.getName();
                                        Long lValueOf = concurrentHashMap.get(name);
                                        if (lValueOf == null && (lPutIfAbsent = concurrentHashMap.putIfAbsent(name, (lValueOf = Long.valueOf(file.lastModified())))) != null) {
                                            lValueOf = lPutIfAbsent;
                                        }
                                        arrayList.add(new C0WKW(file, lValueOf.longValue()));
                                        length += file.length();
                                    }
                                }
                                if (u7.LJ() || u7.LIZIZ()) {
                                    C0LAB c0lab = new C0LAB();
                                    c0lab.LIZIZ(length, "music_size");
                                    C20684815ws.LJIILLIIL("tool_performance_effect_storage_space", c0lab.LIZ);
                                }
                                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
                                Iterator it3 = arrayList.iterator();
                                while (it3.hasNext()) {
                                    arrayList2.add(((C0WKW) it3.next()).LIZ.getName());
                                }
                                c0wkx.LIZJ(C13LP.LLIIJI(arrayList2));
                                C08XD.LJJ(arrayList, new Comparator() { // from class: X.0WKV
                                    @Override // java.util.Comparator
                                    public final int compare(Object obj, Object obj2) {
                                        long j2 = ((C0WKW) obj).LIZIZ;
                                        long j3 = ((C0WKW) obj2).LIZIZ;
                                        if (j2 > j3) {
                                            return 1;
                                        }
                                        if (j2 < j3) {
                                            return -1;
                                        }
                                        return 0;
                                    }
                                });
                                for (C0WKW c0wkw : arrayList) {
                                    c0wkx.LIZLLL.put(c0wkw.LIZ.getName(), c0wkw);
                                }
                                C0VSJ c0vsj3 = new C0VSJ(c0wkx.LIZ, "journal_temp");
                                ArrayList arrayList3 = new ArrayList();
                                Iterator<T> it4 = c0wkx.LIZLLL.entrySet().iterator();
                                while (it4.hasNext()) {
                                    Map.Entry entry = (Map.Entry) it4.next();
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append((String) entry.getKey());
                                    sbLIZ.append(' ');
                                    sbLIZ.append(((C0WKW) entry.getValue()).LIZIZ);
                                    arrayList3.add(C2188811AlT.LIZIZ(sbLIZ));
                                }
                                C09BH.LJIIIZ(c0vsj3, C13LP.LJJLIIIJ(arrayList3, "\n", null, "\n", 0, null, null, 58), Charsets.UTF_8);
                                c0vsj3.renameTo(new C0VSJ(c0wkx.LIZ, "journal"));
                            }
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("MusicDiskLruCache  ");
                            sbLIZ2.append(e.getLocalizedMessage());
                            C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
                        }
                        c0wkx.LJII.unlock();
                        if (((Boolean) C0ARC.LIZ.getValue()).booleanValue()) {
                            return;
                        }
                        c0wkx.LJIIJ.removeCallbacks(c0wkx.LJIIIZ);
                        C786410Ut5.LJLIIL(10000L, c0wkx.LJIIJ, c0wkx.LJIIIZ);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c0wkx.LJII.unlock();
                        throw th;
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("MusicDiskLruCache@763.<init>$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("MusicDiskLruCache@763.<init>$1");
                }
            });
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("exists: ");
        sbLIZ.append(c0vsj.exists());
        sbLIZ.append(", isDirectory: ");
        sbLIZ.append(c0vsj.isDirectory());
        sbLIZ.append(", canRead: ");
        sbLIZ.append(c0vsj.canRead());
        sbLIZ.append(", canWrite: ");
        sbLIZ.append(c0vsj.canWrite());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("dir error!  ");
        sbLIZ2.append(strLIZIZ);
        throw new IOException(C2188811AlT.LIZIZ(sbLIZ2));
    }
}
