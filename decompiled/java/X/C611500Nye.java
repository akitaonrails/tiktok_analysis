package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.CommentSuggestInfo;
import com.ss.android.ugc.aweme.notice.repo.list.bean.GeneralTemplateNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeExtraData;
import com.ss.android.ugc.aweme.tars.TarsSharedInterface;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AFwS201S0000000_14;

/* JADX INFO: renamed from: X.0Nye, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C611500Nye implements InterfaceC1349370lDb {
    public static C0Z0Y LIZIZ;
    public static boolean LJII;
    public static final C611500Nye LIZ = new C611500Nye();
    public static final Map<String, C611480Nyc> LIZJ = new LinkedHashMap();
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(1749));
    public static final C054G LJ = C2296808zG.LIZ(C0PEM.LIZJ);
    public static final AtomicBoolean LJFF = new AtomicBoolean(false);
    public static final C01GW LJI = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(270));
    public static final C01GW LJIIIIZZ = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(286));

    @Override // X.InterfaceC1349370lDb
    public final List<String> LIZ(String str) {
        C611480Nyc c611480Nyc = (C611480Nyc) ((LinkedHashMap) LIZJ).get(str);
        if (c611480Nyc != null) {
            return c611480Nyc.LIZIZ;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(X.InterfaceC1364105Vn<? super kotlin.Unit> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C611460Nya
            if (r0 == 0) goto L5e
            r5 = r7
            X.0Nya r5 = (X.C611460Nya) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5e
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r4 = r5.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L28
            if (r0 == r1) goto L3e
            if (r0 != r2) goto L64
            X.C155000ia.LIZIZ(r4)
        L25:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L28:
            X.C155000ia.LIZIZ(r4)
            X.01GW r0 = X.C611500Nye.LJI
            java.lang.Object r0 = r0.getValue()
            X.0NyZ r0 = (X.InterfaceC611450NyZ) r0
            if (r0 == 0) goto L25
            r5.LLILLL = r1
            java.lang.Object r4 = r0.LIZ(r5)
            if (r4 != r3) goto L41
            return r3
        L3e:
            X.C155000ia.LIZIZ(r4)
        L41:
            java.lang.Number r4 = (java.lang.Number) r4
            int r1 = r4.intValue()
            r0 = 10000(0x2710, float:1.4013E-41)
            if (r1 <= r0) goto L25
            X.01GW r0 = X.C611500Nye.LJI
            java.lang.Object r0 = r0.getValue()
            X.0NyZ r0 = (X.InterfaceC611450NyZ) r0
            if (r0 == 0) goto L25
            r5.LLILLL = r2
            java.lang.Object r0 = r0.LIZLLL(r5)
            if (r0 != r3) goto L25
            return r3
        L5e:
            X.0Nya r5 = new X.0Nya
            r5.<init>(r6, r7)
            goto L12
        L64:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C611500Nye.LIZJ(X.05Vn):java.lang.Object");
    }

    public final void LIZLLL(List list) {
        boolean z;
        NoticeExtraData noticeExtraData;
        CommentSuggestInfo commentSuggestInfo;
        if (((Number) C0ANU.LIZ.getValue()).intValue() == 1) {
            z = true;
        } else {
            z = false;
        }
        C0Z0K c0z0kLIZLLL = null;
        if (z && LJFF.compareAndSet(false, true)) {
            C23250099c.LIZLLL(LJ, null, null, new C611440NyY(null), 3);
        }
        if (LIZIZ == null && list != null && !list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                GeneralTemplateNotice generalTemplateNotice = ((BaseNotice) it2.next()).templateNotice;
                if (generalTemplateNotice != null && (noticeExtraData = generalTemplateNotice.extraData) != null && (commentSuggestInfo = noticeExtraData.commentSuggestInfo) != null && commentSuggestInfo.type == 2) {
                    synchronized (this) {
                        try {
                            if (LIZIZ == null) {
                                TarsSharedInterface tarsSharedInterface = (TarsSharedInterface) PluggableExtentionKt.pluggableSpi$default(TarsSharedInterface.class, false, false, false, 14, null);
                                if (tarsSharedInterface != null) {
                                    String str = (String) C2507009s4.LIZ.getValue();
                                    LIZ.getClass();
                                    c0z0kLIZLLL = tarsSharedInterface.LIZLLL(str, ((InterfaceC611530Nyh) LJIIIIZZ.getValue()).LIZ());
                                }
                                LIZIZ = c0z0kLIZLLL;
                                if (c0z0kLIZLLL != null) {
                                    c0z0kLIZLLL.LJI(new InterfaceC882520Yji() { // from class: X.0IMn
                                        @Override // X.InterfaceC882520Yji
                                        public final void LIZ(C892820Z0u c892820Z0u) {
                                        }

                                        @Override // X.InterfaceC882520Yji
                                        public final void LIZIZ(Map<String, ? extends Object> map) {
                                        }

                                        @Override // X.InterfaceC882520Yji
                                        public final void onSuccess(Object obj) {
                                        }
                                    });
                                }
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                    return;
                }
            }
        }
    }

    @Override // X.InterfaceC1349370lDb
    public final boolean hasCache(String str) {
        EnumC611490Nyd enumC611490Nyd;
        C611480Nyc c611480Nyc = (C611480Nyc) ((LinkedHashMap) LIZJ).get(str);
        if (c611480Nyc != null) {
            enumC611490Nyd = c611480Nyc.LIZ;
        } else {
            enumC611490Nyd = null;
        }
        if (enumC611490Nyd == EnumC611490Nyd.SUCCESS) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1349370lDb
    public final void LIZIZ(final String str, Map map, final C1349340lDY c1349340lDY) {
        EnumC611490Nyd enumC611490Nyd;
        C0Z0Y c0z0y = LIZIZ;
        if (c0z0y == null) {
            c1349340lDY.onError(str);
            return;
        }
        Map<String, C611480Nyc> map2 = LIZJ;
        LinkedHashMap linkedHashMap = (LinkedHashMap) map2;
        if (linkedHashMap.get(str) != null) {
            C611480Nyc c611480Nyc = (C611480Nyc) linkedHashMap.get(str);
            if (c611480Nyc != null) {
                enumC611490Nyd = c611480Nyc.LIZ;
            } else {
                enumC611490Nyd = null;
            }
            if (enumC611490Nyd == EnumC611490Nyd.INFERENCING) {
                c1349340lDY.onError(str);
                return;
            }
        }
        map2.put(str, new C611480Nyc(EnumC611490Nyd.INFERENCING, null, 12));
        c0z0y.LJIIIIZZ(map, new InterfaceC892690Z0h() { // from class: X.0Nyf
            @Override // X.InterfaceC892690Z0h
            public final void LIZ(C882890YkJ c882890YkJ) {
                List<String> list;
                if (c882890YkJ.LJ) {
                    Object obj = c882890YkJ.LJ().get("top_emojis");
                    if ((obj instanceof List) && (list = (List) obj) != null && C13LP.LJJJLL(list) != null) {
                        C611500Nye.LIZ.getClass();
                        LinkedHashMap linkedHashMap2 = (LinkedHashMap) C611500Nye.LIZJ;
                        C611480Nyc c611480Nyc2 = (C611480Nyc) linkedHashMap2.get(str);
                        if (c611480Nyc2 != null) {
                            c611480Nyc2.LIZ = EnumC611490Nyd.SUCCESS;
                        }
                        C611480Nyc c611480Nyc3 = (C611480Nyc) linkedHashMap2.get(str);
                        if (c611480Nyc3 != null) {
                            c611480Nyc3.LIZIZ = list;
                        }
                        if (linkedHashMap2.get(str) != null) {
                            C13LP.LJJJLL(list);
                        }
                        InterfaceC611520Nyg interfaceC611520Nyg = c1349340lDY;
                        if (interfaceC611520Nyg != null) {
                            interfaceC611520Nyg.LIZ(str, list);
                        }
                        C23250099c.LIZLLL(C611500Nye.LJ, null, null, new C611430NyX(str, list, null), 3);
                        return;
                    }
                    C611500Nye.LIZ.getClass();
                    C611480Nyc c611480Nyc4 = (C611480Nyc) ((LinkedHashMap) C611500Nye.LIZJ).get(str);
                    if (c611480Nyc4 != null) {
                        c611480Nyc4.LIZ = EnumC611490Nyd.FAIL;
                    }
                    InterfaceC611520Nyg interfaceC611520Nyg2 = c1349340lDY;
                    if (interfaceC611520Nyg2 == null) {
                        return;
                    }
                    interfaceC611520Nyg2.onError(str);
                    return;
                }
                C611500Nye.LIZ.getClass();
                C611480Nyc c611480Nyc5 = (C611480Nyc) ((LinkedHashMap) C611500Nye.LIZJ).get(str);
                if (c611480Nyc5 != null) {
                    c611480Nyc5.LIZ = EnumC611490Nyd.FAIL;
                }
                InterfaceC611520Nyg interfaceC611520Nyg3 = c1349340lDY;
                if (interfaceC611520Nyg3 == null) {
                    return;
                }
                String str2 = str;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("tars error,");
                sbLIZ.append(c882890YkJ.LJFF);
                C2188811AlT.LIZIZ(sbLIZ);
                interfaceC611520Nyg3.onError(str2);
            }
        });
    }
}
