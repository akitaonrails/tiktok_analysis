package X;

import android.content.DialogInterface;
import android.os.Bundle;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.texttoimage.intro.TextToImageIntroFragment;
import com.zhiliaoapp.musically.R;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0Mcx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC20647615qs("text_2_image_guide_pop_up")
public final class C572570Mcx extends C10GR {
    public final C19EG LL;
    public final VideoPublishEditModel LLILLJJLI;
    public final Function0<Unit> LLILLL;

    @Override // X.InterfaceC20660515sx
    public final int getPriority() {
        return 0;
    }

    @Override // X.InterfaceC20660415sw
    public final C688120Qyw i2() {
        C19EG c19eg = this.LL;
        if (c19eg != null) {
            return new C688120Qyw(c19eg, c19eg, null);
        }
        return null;
    }

    @Override // X.InterfaceC20659015si
    public final void LJFF(C688120Qyw c688120Qyw, C20656615sK c20656615sK) {
        boolean z;
        Integer numLIZJ;
        String str;
        String strLJI;
        C19EG c19eg = this.LL;
        if (c19eg != null) {
            C572240McQ c572240McQ = C572240McQ.LIZ;
            VideoPublishEditModel videoPublishEditModel = this.LLILLJJLI;
            c572240McQ.getClass();
            C0LAB c0lab = new C0LAB();
            c0lab.LJ("enter_from", videoPublishEditModel.getEnterFrom());
            c0lab.LJ("content_type", "multi_photo");
            c0lab.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel));
            c0lab.LJ("shoot_way", videoPublishEditModel.mShootWay);
            c0lab.LJ("creation_id", videoPublishEditModel.getCreationId());
            c0lab.LJ("entrance", C572310McX.LJI(videoPublishEditModel));
            C20684815ws.LJIILLIIL("show_text2img_new_user_guide_entrance", c0lab.LIZ);
            final long jCurrentTimeMillis = System.currentTimeMillis();
            C572540Mcu.LIZ.getClass();
            if (C572540Mcu.LIZJ(null).length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z && !C07CI.LIZIZ()) {
                final C013C c013c = new C013C();
                C770750ULh c770750ULh = new C770750ULh();
                c770750ULh.LIZJ = AFwS239S0000000_8.get$arr$(135);
                C572510Mcr.LIZ.getClass();
                c770750ULh.LJ = C572510Mcr.LIZIZ();
                c770750ULh.LIZJ(C572510Mcr.LIZ());
                if (C07CI.LIZIZ()) {
                    strLJI = C20642515q3.LJI(2131821506);
                } else {
                    strLJI = C20642515q3.LJI(2131821541);
                }
                c770750ULh.LJI(strLJI, new AwS587S0100000_8(c013c, 292));
                c770750ULh.LIZLLL = 0;
                c770750ULh.LJIJI = Integer.valueOf(R.style.xm);
                C1390920mIc c1390920mIcLIZIZ = c770750ULh.LIZIZ();
                Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.zi, this.LL);
                TuxSheet tuxSheet = c1390920mIcLIZIZ.LIZ;
                tuxSheet.LLJI = numLIZJ2;
                tuxSheet.LLILLJJLI = new DialogInterface.OnDismissListener() { // from class: X.0Mcz
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        String str2;
                        if (c013c.element) {
                            str2 = "click_try_now_btn";
                        } else {
                            str2 = "click_close_popup";
                        }
                        C572240McQ c572240McQ2 = C572240McQ.LIZ;
                        VideoPublishEditModel videoPublishEditModel2 = this.LLILLJJLI;
                        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                        c572240McQ2.getClass();
                        C572240McQ.LIZLLL(videoPublishEditModel2, str2, jCurrentTimeMillis2);
                        PopupManager.LIZJ(C572570Mcx.class);
                        this.LLILLL.invoke();
                    }
                };
                tuxSheet.show(c19eg.getSupportFragmentManager(), "TextToImageIntro");
            } else {
                C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
                C572510Mcr c572510Mcr = C572510Mcr.LIZ;
                C19EG c19eg2 = this.LL;
                c572510Mcr.getClass();
                if (C07CI.LIZIZ()) {
                    numLIZJ = C1308910kAL.LIZJ(R.attr.uk, c19eg2);
                } else {
                    numLIZJ = C1308910kAL.LIZJ(R.attr.zi, c19eg2);
                }
                c1390920mIc.LIZ.LLJI = numLIZJ;
                c1390920mIc.LJIIIIZZ(0);
                c1390920mIc.LIZLLL(R.style.xm, false);
                String strLIZJ = C572540Mcu.LIZJ(null);
                if (strLIZJ.length() == 0) {
                    strLIZJ = "";
                } else {
                    File[] fileArrListFiles = new C0VSJ(strLIZJ).listFiles();
                    if (fileArrListFiles != null) {
                        int length = fileArrListFiles.length;
                        int i = 0;
                        while (true) {
                            if (i >= length) {
                                break;
                            }
                            File file = fileArrListFiles[i];
                            if (C07CI.LIZIZ()) {
                                str = "phototext_aitextmode_guide1_tux_lottie";
                            } else {
                                str = "phototext_texttophoto_guide_tux_lottie";
                            }
                            if (file.isFile() && a0.LJJIIZI(file.getAbsolutePath(), str, false)) {
                                strLIZJ = file.getAbsolutePath();
                                break;
                            }
                            i++;
                        }
                    }
                }
                Bundle bundle = new Bundle();
                C786410Ut5.LJJJI("lottie_file", strLIZJ, bundle);
                TextToImageIntroFragment textToImageIntroFragment = new TextToImageIntroFragment();
                textToImageIntroFragment.setArguments(bundle);
                TuxSheet tuxSheet2 = c1390920mIc.LIZ;
                tuxSheet2.LLJJIJI = textToImageIntroFragment;
                tuxSheet2.LLILLJJLI = new DialogInterface.OnDismissListener() { // from class: X.0Mcy
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        String str2;
                        String str3 = TuxSheet._pnsPageId;
                        if (Intrinsics.LJFF(C1391190mJ3.LJIIJJI(dialogInterface), C572650Md5.LIZ)) {
                            str2 = "click_try_now_btn";
                        } else {
                            str2 = "click_close_popup";
                        }
                        C572240McQ c572240McQ2 = C572240McQ.LIZ;
                        VideoPublishEditModel videoPublishEditModel2 = this.LL.LLILLJJLI;
                        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                        c572240McQ2.getClass();
                        C572240McQ.LIZLLL(videoPublishEditModel2, str2, jCurrentTimeMillis2);
                        PopupManager.LIZJ(C572570Mcx.class);
                        this.LL.LLILLL.invoke();
                    }
                };
                tuxSheet2.show(this.LL.getSupportFragmentManager(), "TextToImageLottieIntro");
            }
            C562670M4z.LIZ.getClass();
            C562670M4z.LIZLLL();
        }
    }

    public C572570Mcx(C19EG c19eg, VideoPublishEditModel videoPublishEditModel, Function0<Unit> function0) {
        this.LL = c19eg;
        this.LLILLJJLI = videoPublishEditModel;
        this.LLILLL = function0;
    }
}
