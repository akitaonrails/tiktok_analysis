package X;

import android.content.SharedPreferences;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.favorites.service.IFavoriteService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.model.CollectedMusicList;
import com.ss.android.ugc.aweme.music.service.IMusicService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.14yU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20440014yU {
    public static final C20440014yU LJIIJ = C20440114yV.LIZ;
    public InterfaceC20439814yS LIZ;
    public InterfaceC20440614ya LIZIZ;
    public boolean LJ;
    public int LJFF;
    public boolean LJI;
    public volatile boolean LJIIIIZZ;
    public final CopyOnWriteArrayList<MusicModel> LIZJ = new CopyOnWriteArrayList<>();
    public final CopyOnWriteArrayList<MusicModel> LIZLLL = new CopyOnWriteArrayList<>();
    public final C20440214yW LJII = new C20440214yW();
    public final C01GW LJIIIZ = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(10));

    public final void LJIIIIZZ() {
        this.LJ = true;
        this.LJFF = 0;
        this.LJI = false;
        this.LIZJ.clear();
        this.LIZLLL.clear();
        this.LJIIIIZZ = false;
    }

    public static CollectedMusicList LIZIZ() {
        String string = C15IU.LIZIZ.LIZ.getString("collect_music_list", "");
        if (string == null || string.length() == 0) {
            return null;
        }
        try {
            return (CollectedMusicList) C19615511on.LIZ.LJII(string, CollectedMusicList.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            SharedPreferences.Editor editorEdit = C15IU.LIZIZ.LIZ.edit();
            editorEdit.remove("collect_music_list");
            editorEdit.commit();
            return null;
        }
    }

    public static boolean LIZJ(List list, boolean z) {
        CopyOnWriteArrayList<MusicModel> copyOnWriteArrayList;
        if (z) {
            copyOnWriteArrayList = LJIIJ.LIZLLL;
        } else {
            copyOnWriteArrayList = LJIIJ.LIZJ;
        }
        C13BV c13bv = C13BV.INSTANCE;
        if (z) {
            if (list.size() <= 1 && copyOnWriteArrayList.isEmpty()) {
                return true;
            }
            if (list.size() > 1) {
                list = list.subList(1, list.size());
            } else {
                list = c13bv;
            }
        }
        if (list.size() != copyOnWriteArrayList.size()) {
            return true;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!Intrinsics.LJFF(((MusicModel) ListProtector.get(list, i)).getMusicId(), copyOnWriteArrayList.get(i).getMusicId())) {
                return true;
            }
        }
        return false;
    }

    public final void LJII(int i, boolean z) {
        if (!this.LJ) {
            if (z) {
                LJIIIIZZ();
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C20439314yN(this, null), 3);
                return;
            } else {
                LJIIIIZZ();
                C23250099c.LIZLLL(C817503Hh.LL, null, null, new C20439714yR(i, null, this, null), 3);
                return;
            }
        }
        InterfaceC20439814yS interfaceC20439814yS = this.LIZ;
        if (interfaceC20439814yS != null) {
            interfaceC20439814yS.LIZLLL();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List<MusicModel> LIZ(List<MusicModel> list, List<? extends MusicModel> list2, boolean z) {
        List<MusicModel> similarMusicList;
        IFavoriteService iFavoriteService;
        if (z || ((iFavoriteService = (IFavoriteService) this.LJIIIZ.getValue()) != null && iFavoriteService.LJJIL())) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (MusicModel musicModel : list) {
                String musicId = musicModel.getMusicId();
                if (musicId == null) {
                    musicId = String.valueOf(musicModel.getId());
                }
                if (C123100dR.LIZ(musicId)) {
                    linkedHashSet.add(musicId);
                }
                List<MusicModel> similarMusicList2 = musicModel.getSimilarMusicList();
                if (similarMusicList2 != null) {
                    for (MusicModel musicModel2 : similarMusicList2) {
                        String musicId2 = musicModel2.getMusicId();
                        if (musicId2 == null) {
                            musicId2 = String.valueOf(musicModel2.getId());
                        }
                        if (C123100dR.LIZ(musicId2)) {
                            linkedHashSet.add(musicId2);
                        }
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            for (MusicModel musicModel3 : list2) {
                ArrayList arrayList2 = null;
                if (C123100dR.LIZ(musicModel3.getMusicId()) && linkedHashSet.add(musicModel3.getMusicId())) {
                    List<MusicModel> similarMusicList3 = musicModel3.getSimilarMusicList();
                    if (similarMusicList3 != null) {
                        arrayList2 = new ArrayList();
                        for (MusicModel musicModel4 : similarMusicList3) {
                            MusicModel musicModel5 = musicModel4;
                            if (C123100dR.LIZ(musicModel5.getMusicId()) && linkedHashSet.add(musicModel5.getMusicId())) {
                                arrayList2.add(musicModel4);
                            }
                        }
                    }
                    musicModel3.setSimilarMusicList(arrayList2);
                    arrayList.add(musicModel3);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : arrayList) {
                MusicModel musicModel6 = (MusicModel) obj;
                if (!musicModel6.isOffline() || ((similarMusicList = musicModel6.getSimilarMusicList()) != null && !similarMusicList.isEmpty())) {
                    arrayList3.add(obj);
                }
            }
            if (!z) {
                list.addAll(arrayList3);
            }
            return arrayList3;
        }
        list.addAll(list2);
        return list2;
    }

    public final void LJIIIZ(boolean z, List<? extends MusicModel> list, MusicModel musicModel) {
        if (z) {
            int i = 0;
            for (MusicModel musicModel2 : this.LIZJ) {
                if (musicModel != null && musicModel.getMusicId() != null && Intrinsics.LJFF(musicModel.getMusicId(), musicModel2.getMusicId())) {
                    if (i >= 0 && i < this.LIZJ.size()) {
                        try {
                            this.LIZJ.addAll(i + 1, list);
                            return;
                        } catch (IndexOutOfBoundsException e) {
                            TryCatchGuardChecker.doCheck(e);
                            C201955140j.LJIIJ(C201962140q.LIZIZ, "updateSimilarMusic IndexOutOfBoundsException", e);
                            return;
                        }
                    }
                    return;
                }
                i++;
            }
            return;
        }
        this.LIZJ.removeAll(list);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(int r17, int r18, int r19, boolean r20, X.InterfaceC1364105Vn r21) {
        /*
            r16 = this;
            r11 = 0
            r3 = r21
            boolean r0 = r3 instanceof X.C20439514yP
            r7 = r16
            if (r0 == 0) goto L96
            r15 = r3
            X.14yP r15 = (X.C20439514yP) r15
            int r2 = r15.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L96
            int r2 = r2 - r1
            r15.LLILLL = r2
        L17:
            java.lang.Object r4 = r15.LL
            java.lang.Object r1 = X.C099R.LJFF()
            int r0 = r15.LLILLL
            r14 = 1
            if (r0 == 0) goto L7c
            if (r0 != r14) goto Lbe
            X.C155000ia.LIZIZ(r4)
        L27:
            com.ss.android.ugc.aweme.music.model.CollectedMusicList r4 = (com.ss.android.ugc.aweme.music.model.CollectedMusicList) r4
            r0 = 0
            r7.LJ = r0
            if (r4 == 0) goto Lb6
            java.util.List r1 = r4.getItems()
            if (r1 == 0) goto Lac
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto Lac
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r5 = r1.iterator()
        L43:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L9d
            java.lang.Object r0 = r5.next()
            com.ss.android.ugc.aweme.music.model.Music r0 = (com.ss.android.ugc.aweme.music.model.Music) r0
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r3 = r0.convertToMusicModel()
            com.ss.android.ugc.aweme.feed.model.LogPbBean r0 = r4.getLogPb()
            r3.setLogPbOrNot(r0)
            java.util.List r0 = r3.getSimilarMusicList()
            if (r0 == 0) goto L78
            java.util.Iterator r2 = r0.iterator()
        L64:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L78
            java.lang.Object r1 = r2.next()
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r1 = (com.ss.android.ugc.aweme.shortvideo.model.MusicModel) r1
            com.ss.android.ugc.aweme.feed.model.LogPbBean r0 = r4.getLogPb()
            r1.setLogPbOrNot(r0)
            goto L64
        L78:
            r6.add(r3)
            goto L43
        L7c:
            X.C155000ia.LIZIZ(r4)
            r8 = r17
            if (r8 != 0) goto L86
            r7.LJIIIIZZ()
        L86:
            r15.LLILLL = r14
            r12 = r20
            r10 = r19
            r9 = r18
            r13 = r11
            java.lang.Object r4 = r7.LJ(r8, r9, r10, r11, r12, r13, r14, r15)
            if (r4 != r1) goto L27
            return r1
        L96:
            X.14yP r15 = new X.14yP
            r15.<init>(r7, r3)
            goto L17
        L9d:
            X.14yS r0 = r7.LIZ
            if (r0 == 0) goto La4
            r0.LIZ(r6)
        La4:
            r7.LJIIIIZZ = r14
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r4, r6)
            return r0
        Lac:
            r7.LJIIIIZZ = r14
            X.13BV r1 = X.C13BV.INSTANCE
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r4, r1)
            return r0
        Lb6:
            X.13BV r1 = X.C13BV.INSTANCE
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r11, r1)
            return r0
        Lbe:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20440014yU.LIZLLL(int, int, int, boolean, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJI(int r14, int r15, int r16, java.lang.String r17, X.InterfaceC1364105Vn r18) {
        /*
            r13 = this;
            r8 = 0
            r3 = r18
            boolean r0 = r3 instanceof X.C20439614yQ
            r4 = r13
            if (r0 == 0) goto L8c
            r12 = r3
            X.14yQ r12 = (X.C20439614yQ) r12
            int r2 = r12.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L8c
            int r2 = r2 - r1
            r12.LLILLL = r2
        L16:
            java.lang.Object r6 = r12.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r12.LLILLL
            r0 = 1
            if (r1 == 0) goto L78
            if (r1 != r0) goto La0
            X.C155000ia.LIZIZ(r6)
        L26:
            com.ss.android.ugc.aweme.music.model.CollectedMusicList r6 = (com.ss.android.ugc.aweme.music.model.CollectedMusicList) r6
            if (r6 == 0) goto L98
            java.util.List r1 = r6.getItems()
            if (r1 == 0) goto L98
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L98
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r4 = r1.iterator()
        L3f:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L92
            java.lang.Object r0 = r4.next()
            com.ss.android.ugc.aweme.music.model.Music r0 = (com.ss.android.ugc.aweme.music.model.Music) r0
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r3 = r0.convertToMusicModel()
            com.ss.android.ugc.aweme.feed.model.LogPbBean r0 = r6.getLogPb()
            r3.setLogPbOrNot(r0)
            java.util.List r0 = r3.getSimilarMusicList()
            if (r0 == 0) goto L74
            java.util.Iterator r2 = r0.iterator()
        L60:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L74
            java.lang.Object r1 = r2.next()
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r1 = (com.ss.android.ugc.aweme.shortvideo.model.MusicModel) r1
            com.ss.android.ugc.aweme.feed.model.LogPbBean r0 = r6.getLogPb()
            r1.setLogPbOrNot(r0)
            goto L60
        L74:
            r5.add(r3)
            goto L3f
        L78:
            X.C155000ia.LIZIZ(r6)
            r12.LLILLL = r0
            r9 = 0
            r10 = r17
            r7 = r16
            r6 = r15
            r5 = r14
            r11 = r9
            java.lang.Object r6 = r4.LJ(r5, r6, r7, r8, r9, r10, r11, r12)
            if (r6 != r2) goto L26
            return r2
        L8c:
            X.14yQ r12 = new X.14yQ
            r12.<init>(r4, r3)
            goto L16
        L92:
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r6, r5)
            return r0
        L98:
            X.13BV r1 = X.C13BV.INSTANCE
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r6, r1)
            return r0
        La0:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20440014yU.LJI(int, int, int, java.lang.String, X.05Vn):java.lang.Object");
    }

    public final Object LJ(final int i, int i2, int i3, String str, boolean z, String str2, final boolean z2, InterfaceC1364105Vn<? super CollectedMusicList> interfaceC1364105Vn) {
        String str3;
        final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(interfaceC1364105Vn));
        IMusicService iMusicService = (IMusicService) ServiceManager.get().getService(IMusicService.class);
        IFavoriteService iFavoriteService = (IFavoriteService) this.LJIIIZ.getValue();
        if (iFavoriteService != null && iFavoriteService.LJJIL()) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        C15O7 c15o7LJJIII = iMusicService.LJJIII(i, i2, i3, Boolean.valueOf(z), str, str3, str2);
        if (c15o7LJJIII != null) {
            c15o7LJJIII.LIZLLL(new InterfaceC2385309Wh() { // from class: X.14yT
                @Override // X.InterfaceC2385309Wh
                public final Object then(C15O7 c15o7) {
                    C1C7U.LIZ("CollectMusicManager@c42d.loadCollectedMusicList$2$1");
                    if (!c15o7.LJIILL() && c15o7.LJIILJJIL()) {
                        if (c15o7.LJIIL() != null) {
                            InterfaceC1364105Vn<CollectedMusicList> interfaceC1364105Vn2 = c23260099m;
                            Object objLJIIL = c15o7.LJIIL();
                            C189200o6.m2constructorimpl(objLJIIL);
                            interfaceC1364105Vn2.resumeWith(objLJIIL);
                            if (z2 && i == 0) {
                                C20440014yU c20440014yU = this;
                                Object objLJIIL2 = c15o7.LJIIL();
                                c20440014yU.getClass();
                                C15IU c15iu = C15IU.LIZIZ;
                                String json = GsonProtectorUtils.toJson(C19615511on.LIZ, objLJIIL2);
                                SharedPreferences.Editor editorEdit = c15iu.LIZ.edit();
                                editorEdit.putString("collect_music_list", json);
                                editorEdit.commit();
                            }
                        } else {
                            InterfaceC1364105Vn<CollectedMusicList> interfaceC1364105Vn3 = c23260099m;
                            C189200o6.m2constructorimpl(null);
                            interfaceC1364105Vn3.resumeWith(null);
                        }
                    } else if (this.LJ && z2) {
                        CollectedMusicList collectedMusicListLIZIZ = C20440014yU.LIZIZ();
                        if (collectedMusicListLIZIZ != null) {
                            collectedMusicListLIZIZ.setHasMore(false);
                        }
                        InterfaceC1364105Vn<CollectedMusicList> interfaceC1364105Vn4 = c23260099m;
                        C189200o6.m2constructorimpl(collectedMusicListLIZIZ);
                        interfaceC1364105Vn4.resumeWith(collectedMusicListLIZIZ);
                    } else {
                        InterfaceC1364105Vn<CollectedMusicList> interfaceC1364105Vn5 = c23260099m;
                        C189200o6.m2constructorimpl(null);
                        interfaceC1364105Vn5.resumeWith(null);
                    }
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("CollectMusicManager@c42d.loadCollectedMusicList$2$1");
                    return unit;
                }
            });
        }
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLIZ;
    }
}
