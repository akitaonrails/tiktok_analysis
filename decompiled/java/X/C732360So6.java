package X;

import android.text.TextPaint;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.assem.share.VideoShareAssem;
import com.ss.android.ugc.feed.platform.ab.LowScreenOptimizeAB;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.text.Regex;

/* JADX INFO: renamed from: X.0So6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C732360So6 extends C09AY implements InterfaceC1631620sYq<VideoShareAssem, C732630SoX, C732600SoU, Unit> {
    public C732360So6() {
        super(3);
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(VideoShareAssem videoShareAssem, C732630SoX c732630SoX, C732600SoU c732600SoU) {
        int i;
        InteractAreaCommonAbility interactAreaCommonAbility;
        boolean z;
        float fLIZIZ;
        int iLIZIZ;
        VideoShareAssem videoShareAssem2 = videoShareAssem;
        C732630SoX c732630SoX2 = c732630SoX;
        C732600SoU c732600SoU2 = c732600SoU;
        if (c732630SoX2 == null) {
            videoShareAssem2.getClass();
        } else {
            ConstraintLayout constraintLayout = (ConstraintLayout) videoShareAssem2.getContentView().findViewById(R.id.uz4);
            if (c732630SoX2.LIZ) {
                i = 0;
            } else {
                i = 8;
            }
            C2180521AVm.LIZLLL(constraintLayout, i, C1AV3.LIZ(2, "Feed", null, "share"));
            Float f = c732630SoX2.LIZIZ;
            if (f != null) {
                C786410Ut5.c5(constraintLayout, f.floatValue());
            }
            constraintLayout.setEnabled(c732630SoX2.LIZJ);
        }
        if (c732600SoU2 != null) {
            TuxTextView tuxTextView = (TuxTextView) videoShareAssem2.getContentView().findViewById(R.id.uz7);
            C2180521AVm.LIZLLL(tuxTextView, c732600SoU2.LIZ, C1AV3.LIZ(1, "Feed", null, "share"));
            Float f2 = c732600SoU2.LIZIZ;
            if (f2 != null && f2.floatValue() > 0.0f) {
                tuxTextView.setTextSize(1, f2.floatValue());
            }
            String str = c732600SoU2.LIZJ;
            if (str != null && str.length() > 0) {
                if (!C732110Snh.LJFF()) {
                    C732110Snh.LJI("adjustLongTextSize");
                    if (!C0HCN.LIZJ() && !LowScreenOptimizeAB.LIZIZ()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    boolean zMatches = new Regex(".*\\d+.*").matches(str);
                    C426750GoL.LJIIL(tuxTextView, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), null, 26);
                    if (!zMatches) {
                        TextPaint paint = tuxTextView.getPaint();
                        if (paint != null) {
                            fLIZIZ = paint.measureText(str);
                        } else {
                            fLIZIZ = C418440Gaw.LIZIZ(38);
                        }
                        if (z) {
                            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(58));
                        } else {
                            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(62));
                        }
                        if (2 * ((iLIZIZ / 2.0f) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))) <= fLIZIZ) {
                            if (z) {
                                tuxTextView.setTuxFont(92);
                            } else {
                                tuxTextView.setTuxFont(72);
                            }
                            TextPaint paint2 = tuxTextView.getPaint();
                            if (paint2 != null) {
                                paint2.measureText(str);
                            } else {
                                C418440Gaw.LIZIZ(38);
                            }
                        } else if (z) {
                            tuxTextView.setTuxFont(82);
                        } else if (!C732110Snh.LJFF()) {
                            tuxTextView.setTuxFont(72);
                        } else {
                            tuxTextView.setTuxFont(62);
                        }
                    }
                }
                tuxTextView.setText(str);
            }
            videoShareAssem2.getContentView().findViewById(R.id.fuc).setContentDescription(C1356620lPI.LIZ(C20642515q3.LJI(2131823210), C2097908Jt.LIZJ(new Pair("number", ((AppCompatTextView) videoShareAssem2.getContentView().findViewById(R.id.uz7)).getText().toString()))));
        }
        if (c732630SoX2 != null && c732630SoX2.LIZ && c732600SoU2 != null && c732600SoU2.LIZ == 0 && (interactAreaCommonAbility = (InteractAreaCommonAbility) videoShareAssem2.LLJZ.getValue()) != null) {
            interactAreaCommonAbility.zB1(videoShareAssem2);
        }
        return Unit.LIZ;
    }
}
