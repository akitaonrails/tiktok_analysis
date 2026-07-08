package X;

import android.text.TextUtils;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.sei.SeiAppData;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Zuj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C914830Zuj {
    public static String LIZIZ;
    public static Long LIZJ;
    public static String LIZLLL;
    public static InterfaceC937900aVw LJ;
    public static String LJI;
    public static String LJII;
    public static String LJIIIIZZ;
    public static final C914830Zuj LIZ = new C914830Zuj();
    public static WeakReference<C940490aa7> LJFF = new WeakReference<>(null);
    public static final C914840Zuk LJIIIZ = new InterfaceC958970b3v() { // from class: X.0Zuk
        @Override // X.InterfaceC958970b3v
        public final void LIZJ(int i, List list) {
        }

        @Override // X.InterfaceC958970b3v
        public final void LJIILL(InterfaceC937840aVq interfaceC937840aVq, EnumC918810a19 enumC918810a19, EnumC918810a19 enumC918810a192, C938510aWv c938510aWv) {
        }

        @Override // X.InterfaceC958970b3v
        public final void LJJIJL(C2180891AWx c2180891AWx) {
        }

        @Override // X.InterfaceC958970b3v
        public final void LJJJI() {
        }

        @Override // X.InterfaceC958970b3v
        public final boolean LJJJIL() {
            return true;
        }

        @Override // X.InterfaceC958970b3v
        public final void LLIIIL(Map map) {
        }

        @Override // X.InterfaceC958970b3v
        public final void LLIILII(InterfaceC937820aVo interfaceC937820aVo, int i) {
        }

        @Override // X.InterfaceC958970b3v
        public final void LLJJJ() {
        }

        @Override // X.InterfaceC958970b3v
        public final void LLJLILLLLZIIL(SeiAppData seiAppData) {
        }

        @Override // X.InterfaceC958970b3v
        public final void LLJLLL(List list, boolean z) {
        }

        @Override // X.InterfaceC958970b3v
        public final void LLLIIIIL(C2180891AWx c2180891AWx, int i) {
        }

        @Override // X.InterfaceC958970b3v
        public final void LLLJ(LinkUser linkUser) {
        }

        @Override // X.InterfaceC958970b3v
        public final void LLLLL(InterfaceC937820aVo interfaceC937820aVo) {
            C914830Zuj c914830Zuj = C914830Zuj.LIZ;
            C914830Zuj.LJIIIIZZ = interfaceC937820aVo.getLayoutBusinessType();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onPreLayoutSwitch businessType:");
            sbLIZ.append(C914830Zuj.LJIIIIZZ);
            C20441214yg.LIZIZ("outside_view_tag", C2188811AlT.LIZIZ(sbLIZ));
        }
    };

    public static void LIZIZ(boolean z) {
        long jLongValue;
        int i;
        String str;
        C940490aa7 c940490aa7;
        String string;
        String string2;
        C940490aa7 c940490aa72;
        Long l;
        C940490aa7 c940490aa73;
        InterfaceC937820aVo interfaceC937820aVoLJJJJZ;
        List<LinkUser> listLJIIIZ;
        if (LIZJ != null && LJFF != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Long l2 = LIZJ;
            if (l2 != null) {
                jLongValue = l2.longValue();
            } else {
                jLongValue = 0;
            }
            long j = jCurrentTimeMillis - jLongValue;
            StringBuilder sb = new StringBuilder("");
            InterfaceC937900aVw interfaceC937900aVw = LJ;
            if (interfaceC937900aVw != null && (listLJIIIZ = interfaceC937900aVw.LJIIIZ()) != null) {
                int i2 = 0;
                i = 0;
                for (LinkUser linkUser : listLJIIIZ) {
                    int i3 = i2 + 1;
                    if (i2 >= 0) {
                        LinkUser linkUser2 = linkUser;
                        if (!TextUtils.equals(LJII, linkUser2.linkMicId) && C1533950q1J.LJ(linkUser2.linkMicId)) {
                            i++;
                            sb.append(linkUser2.linkMicId);
                            sb.append(",");
                        }
                        i2 = i3;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            } else {
                i = 0;
            }
            if (sb.length() > 0) {
                sb.deleteCharAt(sb.length() - 1);
            }
            String layoutBusinessType = LJIIIIZZ;
            if (layoutBusinessType == null) {
                InterfaceC937900aVw interfaceC937900aVw2 = LJ;
                if (interfaceC937900aVw2 != null && (interfaceC937820aVoLJJJJZ = interfaceC937900aVw2.LJJJJZ()) != null) {
                    layoutBusinessType = interfaceC937820aVoLJJJJZ.getLayoutBusinessType();
                } else {
                    layoutBusinessType = null;
                }
            }
            EnumC918970a1P enumC918970a1PLIZ = C916800Zxu.LIZ(layoutBusinessType);
            String str2 = (String) C917520Zz4.LJII(enumC918970a1PLIZ).getFirst();
            String str3 = (String) C917520Zz4.LJII(enumC918970a1PLIZ).getSecond();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("report duration log: anchorUid = ");
            sbLIZ.append(LIZIZ);
            sbLIZ.append(" requestId = ");
            sbLIZ.append(LJI);
            sbLIZ.append(" guestCnt = ");
            sbLIZ.append(i);
            sbLIZ.append(" linkListString = ");
            sbLIZ.append((Object) sb);
            sbLIZ.append(" layoutSetting = ");
            sbLIZ.append(str2);
            sbLIZ.append(" windowSetting = ");
            sbLIZ.append(str3);
            C20441214yg.LIZIZ("outside_view_tag", C2188811AlT.LIZIZ(sbLIZ));
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_multi_view_window_duration");
            String str4 = LJI;
            if (str4 != null && str4.length() != 0) {
                str = LJI;
            } else {
                WeakReference<C940490aa7> weakReference = LJFF;
                if (weakReference != null && (c940490aa7 = weakReference.get()) != null) {
                    str = c940490aa7.LJII;
                } else {
                    str = null;
                }
            }
            c474500IjALIZ.LJJII(str, "request_id");
            c474500IjALIZ.LJJII(Integer.valueOf(i), "guest_cnt");
            c474500IjALIZ.LJJII(str3, "window_setting");
            c474500IjALIZ.LJJII(str2, "layout_setting");
            WeakReference<C940490aa7> weakReference2 = LJFF;
            if (weakReference2 != null && (c940490aa73 = weakReference2.get()) != null) {
                string = Long.valueOf(c940490aa73.LIZ).toString();
            } else {
                string = null;
            }
            c474500IjALIZ.LJJII(string, "room_id");
            WeakReference<C940490aa7> weakReference3 = LJFF;
            if (weakReference3 != null && (c940490aa72 = weakReference3.get()) != null && (l = c940490aa72.LIZIZ) != null) {
                string2 = l.toString();
            } else {
                string2 = null;
            }
            c474500IjALIZ.LJJII(string2, "anchor_id");
            c474500IjALIZ.LJJII(Long.valueOf(j), "duration");
            c474500IjALIZ.LJJII(LIZLLL, "live_type");
            c474500IjALIZ.LJJII(sb.toString(), "link_id_list");
            c474500IjALIZ.LIZ();
            if (z) {
                InterfaceC937900aVw interfaceC937900aVw3 = LJ;
                if (interfaceC937900aVw3 != null) {
                    interfaceC937900aVw3.LJLJLJ(LJIIIZ);
                }
                LJ = null;
                LIZIZ = null;
                LIZJ = null;
                LJII = null;
                LJIIIIZZ = null;
                LIZLLL = null;
                LJFF.clear();
            }
        }
    }

    public static void LIZ(InterfaceC937900aVw interfaceC937900aVw, C940490aa7 c940490aa7, String str, String str2) {
        EnumC940090aZT enumC940090aZT;
        List<LinkUser> listLJIIIZ;
        String layoutBusinessType;
        Long lValueOf;
        Long l;
        String str3;
        String string;
        Long l2;
        Long l3;
        Long l4;
        String string2;
        C940490aa7 c940490aa72;
        Long l5;
        C940490aa7 c940490aa73;
        Long l6;
        InterfaceC937820aVo interfaceC937820aVoLJJJJZ;
        String string3 = null;
        if (c940490aa7 != null) {
            enumC940090aZT = c940490aa7.LJFF;
        } else {
            enumC940090aZT = null;
        }
        if (enumC940090aZT != EnumC940090aZT.SEARCH && interfaceC937900aVw != null && (listLJIIIZ = interfaceC937900aVw.LJIIIZ()) != null && listLJIIIZ.size() > 1) {
            InterfaceC937900aVw interfaceC937900aVw2 = LJ;
            if (interfaceC937900aVw2 != null) {
                interfaceC937900aVw2.LJLJLJ(LJIIIZ);
            }
            LJ = interfaceC937900aVw;
            LJFF = new WeakReference<>(c940490aa7);
            LJII = str;
            InterfaceC937900aVw interfaceC937900aVw3 = LJ;
            if (interfaceC937900aVw3 != null) {
                interfaceC937900aVw3.LJJJJJL(LJIIIZ);
            }
            if (interfaceC937900aVw != null && (interfaceC937820aVoLJJJJZ = interfaceC937900aVw.LJJJJZ()) != null) {
                layoutBusinessType = interfaceC937820aVoLJJJJZ.getLayoutBusinessType();
            } else {
                layoutBusinessType = null;
            }
            LJIIIIZZ = layoutBusinessType;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onParsedSei linkMicFeedPackageData  roomId = ");
            if (c940490aa7 != null) {
                lValueOf = Long.valueOf(c940490aa7.LIZ);
            } else {
                lValueOf = null;
            }
            sbLIZ.append(lValueOf);
            sbLIZ.append(", roomOwnerUserId = ");
            if (c940490aa7 != null) {
                l = c940490aa7.LIZIZ;
            } else {
                l = null;
            }
            sbLIZ.append(l);
            sbLIZ.append(" , currentRequestId = ");
            if (c940490aa7 != null) {
                str3 = c940490aa7.LJII;
            } else {
                str3 = null;
            }
            sbLIZ.append(str3);
            C20441214yg.LIZIZ("outside_view_tag", C2188811AlT.LIZIZ(sbLIZ));
            if (LIZIZ == null) {
                WeakReference<C940490aa7> weakReference = LJFF;
                if (weakReference != null && (c940490aa73 = weakReference.get()) != null && (l6 = c940490aa73.LIZIZ) != null) {
                    string2 = l6.toString();
                } else {
                    string2 = null;
                }
                if (C1533950q1J.LJ(string2)) {
                    WeakReference<C940490aa7> weakReference2 = LJFF;
                    if (weakReference2 != null && (c940490aa72 = weakReference2.get()) != null && (l5 = c940490aa72.LIZIZ) != null) {
                        string3 = l5.toString();
                    }
                    LIZIZ = string3;
                    LIZJ = Long.valueOf(System.currentTimeMillis());
                    LIZLLL = str2;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("enter a multi guest room, anchorUId = ");
                    sbLIZ2.append(LIZIZ);
                    C20441214yg.LIZIZ("outside_view_tag", C2188811AlT.LIZIZ(sbLIZ2));
                    return;
                }
            }
            if (C1533950q1J.LJ(LIZIZ)) {
                String str4 = LIZIZ;
                if (c940490aa7 != null && (l4 = c940490aa7.LIZIZ) != null) {
                    string = l4.toString();
                } else {
                    string = null;
                }
                if (Intrinsics.LJFF(str4, string)) {
                    return;
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("enter another multi guest room, last anchorUId = ");
                sbLIZ3.append(LIZIZ);
                sbLIZ3.append(", current anchorUid = ");
                if (c940490aa7 != null) {
                    l2 = c940490aa7.LIZIZ;
                } else {
                    l2 = null;
                }
                sbLIZ3.append(l2);
                C20441214yg.LIZIZ("outside_view_tag", C2188811AlT.LIZIZ(sbLIZ3));
                LIZIZ(true);
                if (c940490aa7 != null && (l3 = c940490aa7.LIZIZ) != null) {
                    string3 = l3.toString();
                }
                LIZIZ = string3;
                LIZJ = Long.valueOf(System.currentTimeMillis());
                LIZLLL = str2;
                LJ = interfaceC937900aVw;
                LJFF = new WeakReference<>(c940490aa7);
                return;
            }
            return;
        }
        if (C1533950q1J.LJ(LIZIZ)) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("enter a not guest room, last room anchorUId = ");
            sbLIZ4.append(LIZIZ);
            C20441214yg.LIZIZ("outside_view_tag", C2188811AlT.LIZIZ(sbLIZ4));
            LIZIZ(true);
        }
    }
}
