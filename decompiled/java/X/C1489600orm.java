package X;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.common.utility.Logger;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.retrofit2.client.Request;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import m14.l;

/* JADX INFO: renamed from: X.0orm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1489600orm extends AbstractC1489970osN {
    @Override // X.AbstractC1489970osN
    public final void LJFF() {
    }

    @Override // X.AbstractC1489970osN
    public final void LJI() {
    }

    @Override // X.AbstractC1489970osN
    public final EnumC1489930osJ LJII() {
        return EnumC1489930osJ.DEFAULT;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int LJIIIIZZ(Request request) {
        String str;
        EnumC1489530orf enumC1489530orf;
        String str2;
        boolean zLIZJ;
        EnumC1489630orp enumC1489630orp;
        List<C080U> listHeaders = request.headers("x-tt-request-tag");
        if (listHeaders == null || listHeaders.size() < 1 || TextUtils.isEmpty(((C080U) ListProtector.get(listHeaders, 0)).LIZIZ)) {
            str = "";
        } else {
            str = ((C080U) ListProtector.get(listHeaders, 0)).LIZIZ;
        }
        l lVarLJ = l.LJ();
        String url = request.getUrl();
        lVarLJ.getClass();
        Logger.debug();
        if (!C2088908Gh.LIZ(url)) {
            Logger.debug();
            return 0;
        }
        lVarLJ.LJI.readLock().lock();
        ArrayList arrayList = new ArrayList();
        ListProtector.add(arrayList, 0, 0);
        Iterator it2 = ((ArrayList) lVarLJ.LJFF).iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            C09FF c09ff = (C09FF) it2.next();
            Logger.debug();
            c09ff.getClass();
            Logger.debug();
            if (c09ff.LIZJ() && !TextUtils.isEmpty(url)) {
                Uri uri = UriProtector.parse(url);
                if (uri.getHost() != null && c09ff.LIZLLL(uri)) {
                    if (((HashMap) c09ff.LJIIZILJ).isEmpty()) {
                        ListProtector.set(arrayList, 0, Integer.valueOf(c09ff.LJI()));
                        Logger.debug();
                        enumC1489530orf = EnumC1489530orf.DISPATCH_DELAY;
                    } else if (!C1489610orn.LIZIZ.get()) {
                        Logger.debug();
                        enumC1489530orf = EnumC1489530orf.DISPATCH_NONE;
                    } else {
                        if ("".equals(str)) {
                            str2 = "s=0;p=0";
                        } else {
                            str2 = str;
                        }
                        HashMap map = new HashMap();
                        ArrayList<Pair> arrayList2 = new ArrayList();
                        if (!C2089508Gn.LIZIZ(str2, ";", arrayList2)) {
                            enumC1489530orf = EnumC1489530orf.DISPATCH_NONE;
                        } else {
                            for (Pair pair : arrayList2) {
                                map.put(pair.first, pair.second);
                            }
                            EnumC1489630orp enumC1489630orp2 = EnumC1489630orp.NormalStart;
                            String string = Integer.toString(enumC1489630orp2.getValue());
                            if (C1489610orn.LIZ != enumC1489630orp2) {
                                Logger.debug();
                                int i = C1489620oro.LIZ[C1489610orn.LIZ.ordinal()];
                                if (i != 1) {
                                    if (i != 2) {
                                        if (i != 3) {
                                            enumC1489630orp = C1489610orn.LIZ;
                                        } else {
                                            if ((System.currentTimeMillis() / 1000) - C1489610orn.LIZJ.get() > C1489610orn.LJFF.get()) {
                                                C1489610orn.LIZ = enumC1489630orp2;
                                            }
                                            enumC1489630orp = C1489610orn.LIZ;
                                        }
                                    } else {
                                        if ((System.currentTimeMillis() / 1000) - C1489610orn.LIZJ.get() > C1489610orn.LJ.get()) {
                                            C1489610orn.LIZ = enumC1489630orp2;
                                        }
                                        enumC1489630orp = C1489610orn.LIZ;
                                    }
                                } else {
                                    if ((System.currentTimeMillis() / 1000) - C1489610orn.LIZJ.get() > C1489610orn.LIZLLL.get()) {
                                        C1489610orn.LIZ = enumC1489630orp2;
                                    }
                                    enumC1489630orp = C1489610orn.LIZ;
                                }
                                string = Integer.toString(enumC1489630orp.getValue());
                            }
                            map.put("s", string);
                            Context context = l.LJ().LIZ;
                            if (context != null) {
                                zLIZJ = C2104008Mc.LIZJ(context);
                            } else {
                                zLIZJ = 1;
                            }
                            map.put("p", Integer.toString(!zLIZJ));
                            Logger.debug();
                            enumC1489530orf = EnumC1489530orf.DISPATCH_DELAY;
                            Iterator it3 = ((HashMap) c09ff.LJIIZILJ).entrySet().iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    break;
                                }
                                Map.Entry entry = (Map.Entry) it3.next();
                                Object obj = map.get(entry.getKey());
                                if (obj == null) {
                                    enumC1489530orf = EnumC1489530orf.DISPATCH_NONE;
                                    break;
                                }
                                if (!((Set) entry.getValue()).contains(obj)) {
                                    enumC1489530orf = EnumC1489530orf.DISPATCH_NONE;
                                    break;
                                }
                            }
                            if (enumC1489530orf == EnumC1489530orf.DISPATCH_DELAY) {
                                ListProtector.set(arrayList, 0, Integer.valueOf(c09ff.LJI()));
                            }
                            Logger.debug();
                        }
                    }
                } else {
                    enumC1489530orf = EnumC1489530orf.DISPATCH_NONE;
                }
            } else {
                ListProtector.set(arrayList, 0, 0);
                enumC1489530orf = EnumC1489530orf.DISPATCH_NONE;
            }
            if (enumC1489530orf == EnumC1489530orf.DISPATCH_DELAY) {
                Logger.debug();
                break;
            }
        }
        lVarLJ.LJI.readLock().unlock();
        return ((Integer) ListProtector.get(arrayList, 0)).intValue();
    }

    @Override // X.InterfaceC1489890osF
    public final void LIZJ(Request request) {
        long jLJIIIIZZ = LJIIIIZZ(request);
        Logger.debug();
        this.LIZ.LJ(request, true, false, jLJIIIIZZ);
    }

    @Override // X.InterfaceC1489890osF
    public final boolean LIZIZ(Request request, Executor executor, C1494560ozm c1494560ozm) {
        long jLJIIIIZZ = LJIIIIZZ(request);
        Logger.debug();
        return this.LIZ.LIZLLL(request, true, jLJIIIIZZ, c1494560ozm, executor);
    }
}
