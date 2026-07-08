package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.sharepanel.impl.editshare.fragment.EditShareSelectFragment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS275S0300000_31;
import kotlin.jvm.internal.AwS397S0200000_31;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS610S0100000_31;
import kotlin.jvm.internal.AwS645S0100000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15mC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20618615mC implements InterfaceC1428690nHX {
    public static final C20618615mC LIZ = new C20618615mC();

    @Override // X.InterfaceC1428690nHX
    public final boolean LIZIZ() {
        LJIIJ("showDMPanelClickSaveToLocal");
        return (C0AK1.LIZ() == 4 || C0AK1.LIZ() == 5) && C1865360ydq.LIZ() && LJIIIZ("showDMPanelClickSaveToLocal");
    }

    @Override // X.InterfaceC1428690nHX
    public final boolean LIZLLL() {
        LJIIJ("addSideBarDMEntranceForPhotoType");
        return C0AK1.LIZ() > 0 && C1865360ydq.LIZ() && LJIIIZ("addSideBarDMEntranceForPhotoType");
    }

    @Override // X.InterfaceC1428690nHX
    public final String LJ() {
        C20619615mM.LIZ.getClass();
        return C20619615mM.LIZ();
    }

    @Override // X.InterfaceC1428690nHX
    public final boolean LJFF() {
        LJIIJ("addSideBarDMEntranceExceptPhotoType");
        return (C0AK1.LIZ() == 1 || C0AK1.LIZ() == 3 || C0AK1.LIZ() == 4 || C0AK1.LIZ() == 5) && C1865360ydq.LIZ() && LJIIIZ("addSideBarDMEntranceExceptPhotoType");
    }

    @Override // X.InterfaceC1428690nHX
    public final boolean LJI() {
        LJIIJ("addBottomBarDMEntranceExceptPhotoType");
        return (C0AK1.LIZ() == 2 || C0AK1.LIZ() == 5) && C1865360ydq.LIZ() && LJIIIZ("addBottomBarDMEntranceExceptPhotoType");
    }

    @Override // X.InterfaceC1428690nHX
    public final boolean LJII() {
        LJIIJ("isEnable");
        return C0AK1.LIZ() > 0 && C1865360ydq.LIZ() && LJIIIZ("isEnable") && C1385400m9i.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    @Override // X.InterfaceC1428690nHX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ() {
        /*
            r5 = this;
            X.0O22 r0 = X.C0O22.LIZ
            r0.getClass()
            X.0956 r0 = X.C0O22.LJ
            if (r0 == 0) goto L2b
            boolean r1 = r0.isActive()
            r0 = 1
            if (r1 != r0) goto L2b
        L10:
            r4 = 0
            if (r0 == 0) goto L1a
            X.0956 r0 = X.C0O22.LJ
            if (r0 == 0) goto L1a
            r0.LIZIZ(r4)
        L1a:
            X.03Hh r3 = X.C817503Hh.LL
            X.1DFB r2 = X.C0PEM.LIZJ
            X.0O1x r1 = new X.0O1x
            r1.<init>(r4)
            r0 = 2
            X.0956 r0 = X.C23250099c.LIZLLL(r3, r2, r4, r1, r0)
            X.C0O22.LJ = r0
            return
        L2b:
            r0 = 0
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20618615mC.LJIIIIZZ():void");
    }

    @Override // X.InterfaceC1428690nHX
    public final boolean isEnable() {
        LJIIJ("isEnable");
        return C0AK1.LIZ() > 0 && C1865360ydq.LIZ() && LJIIIZ("isEnable");
    }

    @Override // X.InterfaceC1428690nHX
    public final boolean LIZJ() {
        return C0AK1.LIZ() == 1 || C0AK1.LIZ() == 2 || C0AK1.LIZ() == 4 || C0AK1.LIZ() == 5;
    }

    public static boolean LJIIIZ(String str) {
        boolean zLIZJ = C1336205Ku.LIZJ().LIZJ();
        boolean zLJI = C1336205Ku.LIZ(false).getImPrivacySettings().LJI();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(" - isDMOff ");
        sbLIZ.append(zLJI);
        sbLIZ.append(", isDMOffU16 ");
        sbLIZ.append(zLIZJ);
        C2188811AlT.LIZIZ(sbLIZ);
        if (zLJI || zLIZJ) {
            return false;
        }
        return true;
    }

    public static void LJIIJ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(" - sendToPostExperiment ");
        sbLIZ.append(C0AK1.LIZ());
        sbLIZ.append(", dmCameraExperiment ");
        sbLIZ.append(C1865360ydq.LIZ());
        C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1428690nHX
    public final void LIZ(Context context, boolean z, String str, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, Map<String, String> map, InterfaceC20619215mI interfaceC20619215mI, boolean z8, String str2, String str3, String str4, boolean z9, boolean z10, String str5, boolean z11, boolean z12, boolean z13, Function1<? super Boolean, Unit> function1) {
        C19EG c19eg;
        FragmentManager supportFragmentManager;
        Pair pair;
        int i;
        String str6;
        String str7;
        String str8;
        String str9;
        EditShareSelectFragment editShareSelectFragment = new EditShareSelectFragment();
        Bundle bundle = new Bundle();
        if (map != null && (str9 = map.get("enter_method")) != null) {
            C786410Ut5.LJJJI("enter_method", str9, bundle);
        }
        if (map != null && (str8 = map.get("enter_from")) != null) {
            C786410Ut5.LJJJI("enter_from", str8, bundle);
        }
        if (map != null) {
            String str10 = map.get("scenario");
            if (str10 != null) {
                C786410Ut5.LJJJI("scenario", str10, bundle);
            }
            String str11 = map.get("from_group_id");
            if (str11 != null) {
                C786410Ut5.LJJJI("from_group_id", str11, bundle);
            }
        }
        bundle.putBoolean("is_search_mode", z8);
        C786410Ut5.LJJJI("flow_id", str, bundle);
        bundle.putBoolean("is_photo_post", z12);
        if ((context instanceof C19EG) && (c19eg = (C19EG) context) != null && (supportFragmentManager = c19eg.getSupportFragmentManager()) != null) {
            C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
            TuxSheet tuxSheet = c1390920mIc.LIZ;
            tuxSheet.LLJJIJI = editShareSelectFragment;
            tuxSheet.LLJLL = true;
            tuxSheet.LLJLILLLLZIIL = false;
            tuxSheet.LLILLJJLI = new C16HJ(interfaceC20619215mI, 4);
            if (z2) {
                c1390920mIc.LIZ.LLJI = C1308910kAL.LIZJ(R.attr.a1e, context);
            } else {
                c1390920mIc.LIZ.LLJI = C1308910kAL.LIZJ(R.attr.bx, context);
            }
            float fLIZ = C497820Jfg.LIZ(context);
            int i2 = (int) (0.73f * fLIZ);
            if (!z2) {
                c1390920mIc.LIZ.LLJJL = i2;
                c1390920mIc.LJIIIIZZ(1);
            } else {
                C0O22.LIZ.getClass();
                AnonymousClass0956 anonymousClass0956 = C0O22.LJ;
                if (anonymousClass0956 != null && anonymousClass0956.isCompleted()) {
                    String currentUserID = C0CHQ.LIZ().getAccountService().getCurrentUserID();
                    ConcurrentLinkedQueue<IMContact> concurrentLinkedQueue = C0O22.LIZJ;
                    ArrayList arrayList = new ArrayList();
                    for (IMContact iMContact : concurrentLinkedQueue) {
                        if (!Intrinsics.LJFF(iMContact.getUid(), currentUserID)) {
                            arrayList.add(iMContact);
                        }
                    }
                    int size = arrayList.size();
                    if (size == 0) {
                        if (C19508111Tz.LIZ()) {
                            pair = new Pair(0, 224);
                        } else {
                            pair = new Pair(0, 286);
                        }
                    } else if (C19508111Tz.LIZ()) {
                        pair = new Pair(Integer.valueOf(size), Integer.valueOf((size * 56) + 236));
                    } else {
                        pair = new Pair(Integer.valueOf(size), Integer.valueOf((size * 56) + 254));
                    }
                } else {
                    pair = new Pair(-1, 0);
                }
                int iIntValue = ((Number) pair.getFirst()).intValue();
                int iIntValue2 = ((Number) pair.getSecond()).intValue();
                float f = 0.55f * fLIZ;
                int i3 = (int) f;
                int i4 = (int) (fLIZ * 0.95f);
                if (z8) {
                    c1390920mIc.LIZ.LLJJL = i4;
                    c1390920mIc.LJIIIIZZ(1);
                } else {
                    if (!z3) {
                        iIntValue2 -= 50;
                    }
                    if (z5) {
                        iIntValue2 += 30;
                    }
                    if (z7) {
                        iIntValue2 += 70;
                    }
                    int iLJFF = C418440Gaw.LJFF(f, context);
                    if (iIntValue != -1 && iIntValue2 <= iLJFF && C19508111Tz.LIZ()) {
                        if (iIntValue == 0) {
                            i = 1;
                            bundle.putBoolean("empty_friends_list", true);
                        } else {
                            i = 1;
                            bundle.putBoolean("low_friends_list", true);
                        }
                        c1390920mIc.LJIIIIZZ(i);
                        c1390920mIc.LIZ.LLJLL = false;
                        editShareSelectFragment.LLJJJ = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iIntValue2))));
                    } else {
                        c1390920mIc.LIZIZ(i3, i4);
                        c1390920mIc.LJIIIIZZ(2);
                    }
                }
            }
            editShareSelectFragment.setArguments(bundle);
            TuxSheet tuxSheet2 = c1390920mIc.LIZ;
            if (z) {
                if (map != null) {
                    str6 = map.get("scenario");
                } else {
                    str6 = null;
                }
                C0I0B.LJFF.LIZIZ();
                C13DA c13da = new C13DA();
                if (str6 != null) {
                    c13da.put("scenario", str6);
                }
                c13da.put("editorpro_click_from", str3);
                c13da.put("edit_tab_entrance", str4);
                c13da.put("enter_method", EnumC1431810nMZ.MAIN_POSTING_CAMERA_ICON.getValue());
                c13da.put("enter_from", EnumC539160LCo.VIDEO_EDIT_PAGE.getValue());
                c13da.put("is_pic_frame_single_pic_edit", String.valueOf(z9 ? 1 : 0));
                c13da.put("is_from_external_link", String.valueOf(z10 ? 1 : 0));
                c13da.put("external_link_source", str5);
                if (z9) {
                    c13da.put("pic_cnt", "1");
                    c13da.put("content_type", "multi_photo");
                }
                c13da.put("is_from_multi_photo_special_page", String.valueOf(z13 ? 1 : 0));
                if (map != null) {
                    String str12 = map.get("live_pic_show_cnt");
                    if (str12 != null) {
                        c13da.put("live_pic_show_cnt", str12);
                    }
                    String str13 = map.get("static_livephoto_show_cnt");
                    if (str13 != null) {
                        c13da.put("static_livephoto_show_cnt", str13);
                    }
                    String str14 = map.get("loop_livephoto_show_cnt");
                    if (str14 != null) {
                        c13da.put("loop_livephoto_show_cnt", str14);
                    }
                    String str15 = map.get("live_livephoto_show_cnt");
                    if (str15 != null) {
                        c13da.put("live_livephoto_show_cnt", str15);
                    }
                    String str16 = map.get("click_photo_content");
                    if (str16 != null) {
                        c13da.put("click_photo_content", str16);
                    }
                    String str17 = map.get("ai_livephoto_status");
                    if (str17 != null) {
                        c13da.put("ai_livephoto_status", str17);
                    }
                    String str18 = map.get("shoot_way");
                    if (str18 != null) {
                        c13da.put("shoot_way", str18);
                    }
                    String str19 = map.get("shoot_enter_method");
                    if (str19 != null) {
                        c13da.put("shoot_enter_method", str19);
                    }
                    String str20 = map.get("is_visual_poet");
                    if (str20 != null) {
                        c13da.put("is_visual_poet", str20);
                    }
                    String str21 = map.get("is_collage_photo");
                    if (str21 != null) {
                        c13da.put("is_collage_photo", str21);
                    }
                }
                for (String str22 : C20618815mE.LIZIZ) {
                    if (!c13da.containsKey(str22) && map != null && (str7 = map.get(str22)) != null) {
                        c13da.put(str22, str7);
                    }
                }
                C20684815ws.LJIILLIIL("click_send_dm_camera_button", c13da.build());
            }
            editShareSelectFragment.LLJLLL = str2;
            editShareSelectFragment.LLJJJJLIIL = z2;
            editShareSelectFragment.LLJJL = z3;
            editShareSelectFragment.LLJJLIIIJLLLLLLLZ = z4;
            editShareSelectFragment.LLJL = z5;
            editShareSelectFragment.LLJLIL = z6;
            editShareSelectFragment.LLJLILLLLZIIL = z7;
            editShareSelectFragment.LLJJI = new C20619015mG(context, z, str, z2, z3, z4, z5, z6, z7, map, interfaceC20619215mI, str2, z9, z10, str5, z13, function1);
            editShareSelectFragment.LLJLL = function1;
            editShareSelectFragment.LLJILJILJ = new AwS575S0100000_31(tuxSheet2, 1453);
            editShareSelectFragment.LLJILLL = new AwS575S0100000_31(interfaceC20619215mI, 1454);
            editShareSelectFragment.LLJJIJI = new AwS575S0100000_31(interfaceC20619215mI, 1455);
            editShareSelectFragment.LLJJ = new AwS397S0200000_31(interfaceC20619215mI, tuxSheet2, 94);
            editShareSelectFragment.LLJJIII = new AwS275S0300000_31(interfaceC20619215mI, tuxSheet2, editShareSelectFragment, 35);
            new AwS610S0100000_31(interfaceC20619215mI, 413);
            editShareSelectFragment.LLJJIJIL = new AwS645S0100000_31(interfaceC20619215mI, 95);
            editShareSelectFragment.LLJJIJIIJIL = new AwS610S0100000_31(interfaceC20619215mI, 414);
            tuxSheet2.show(supportFragmentManager, "im_contact_select_long_press_panel");
            if (interfaceC20619215mI != null) {
                interfaceC20619215mI.LJ(false);
            }
            if (z2 && !z11 && interfaceC20619215mI != null) {
                interfaceC20619215mI.LIZLLL();
            }
        }
    }
}
