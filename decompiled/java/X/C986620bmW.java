package X;

import Y.ACListenerS150S0100000_15;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.liveinteract.api.event.TakeTheStageGiftPanelChannel;
import com.bytedance.android.livesdk.livesetting.gift.LiveTakeTheStageLeafFixSetting;
import com.bytedance.android.livesdkapi.host.IHostFrescoHelper;
import com.bytedance.android.livesdkapi.host.user.IHostPad;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0bmW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C986620bmW extends AbstractC1100450ek7 {
    public final LifecycleOwner LLIZ;
    public final DataChannel LLIZLLLIL;
    public final User LLJ;
    public View LLJI;
    public C16F5 LLJIJIL;
    public LinearLayout LLJILJIL;
    public C16F5 LLJILJILJ;
    public C16F5 LLJILLL;
    public C19R6 LLJJ;
    public View LLJJI;
    public C16F5 LLJJIII;
    public C16F5 LLJJIJI;
    public C16F5 LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public boolean LLJJJ;

    @Override // X.AbstractC1100450ek7
    public final void LJJIIZI() {
        if (this.LLJJIJIL) {
            return;
        }
        this.LLJJIJIL = true;
        C986650bmZ c986650bmZ = (C986650bmZ) this.LLIZLLLIL.gg0(TakeTheStageGiftPanelChannel.class);
        if (c986650bmZ != null) {
            LJJJJJL(c986650bmZ);
        }
    }

    public static SpannableStringBuilder LJJJIL(String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(C497740JfY.LJFF(R.color.a3d)), 0, 2, 33);
        return spannableStringBuilder;
    }

    public static String LJJJJ(long j) {
        if (j == 1) {
            return C497740JfY.LJIJI(2131853299);
        }
        if (j == 2) {
            return C497740JfY.LJIJI(2131853300);
        }
        if (j == 3) {
            return C497740JfY.LJIJI(2131853301);
        }
        if (j == 4) {
            return C497740JfY.LJIJI(2131853302);
        }
        return CardStruct.IStatusCode.DEFAULT;
    }

    public final void LJJJJI(boolean z) {
        if (z) {
            C500260Jjc.LLFFF(this.LLJJI);
            C500260Jjc.LLFFF(this.LLJJIII);
        } else {
            C500260Jjc.LJIILIIL(this.LLJJI);
            C500260Jjc.LJIILIIL(this.LLJJIII);
        }
    }

    public final void LJJJJIZL(boolean z) {
        if (z) {
            C500260Jjc.LLFFF(this.LLJJIJI);
            C500260Jjc.LLFFF(this.LLJJIJIIJIL);
        } else {
            C500260Jjc.LJIILIIL(this.LLJJIJI);
            C500260Jjc.LJIILIIL(this.LLJJIJIIJIL);
        }
    }

    public final void LJJJJJL(C986650bmZ c986650bmZ) {
        this.LLJJJ = c986650bmZ.LIZLLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setupView. isStyleV3=");
        sbLIZ.append(this.LLJJJ);
        C20441214yg.LIZIZ("TakeTheStageGiftPanelLeaf", C2188811AlT.LIZIZ(sbLIZ));
        boolean z = c986650bmZ.LIZ;
        if (!this.LLJJJ && z) {
            LJJJJI(true);
            LJJJJIZL(true);
            String strLJJJJ = LJJJJ(c986650bmZ.LIZIZ);
            C16F5 c16f5 = this.LLJJIII;
            if (c16f5 != null) {
                c16f5.setText(strLJJJJ);
            }
            LJJJJIZL(!Intrinsics.LJFF(strLJJJJ, CardStruct.IStatusCode.DEFAULT));
            long j = c986650bmZ.LIZJ;
            C16F5 c16f52 = this.LLJJIJIIJIL;
            if (c16f52 != null) {
                c16f52.setText(C1850730yGF.LIZJ(j));
            }
            this.LLJJIJIL = true;
        } else {
            LJJJJI(false);
            LJJJJIZL(false);
            this.LLJJIJIL = false;
        }
        if (LiveTakeTheStageLeafFixSetting.INSTANCE.getEnable()) {
            LJJJJJ(c986650bmZ.LIZIZ, c986650bmZ.LIZJ, this.LLJ);
        }
    }

    @Override // X.AbstractC1100450ek7
    public final Pair<View, C19ME> LJJJ(Context context, ViewGroup viewGroup, LayoutInflater layoutInflater) {
        Resources resources;
        List urls;
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.hur, viewGroup, false);
        this.LLJI = viewTd.findViewById(R.id.mgn);
        this.LLJIJIL = (C16F5) viewTd.findViewById(R.id.zns);
        this.LLJILJIL = (LinearLayout) viewTd.findViewById(R.id.znw);
        this.LLJILJILJ = (C16F5) viewTd.findViewById(R.id.znx);
        this.LLJILLL = (C16F5) viewTd.findViewById(R.id.znv);
        this.LLJJ = (C19R6) viewTd.findViewById(R.id.znt);
        this.LLJJI = viewTd.findViewById(R.id.mpf);
        this.LLJJIII = (C16F5) viewTd.findViewById(R.id.znq);
        this.LLJJIJI = (C16F5) viewTd.findViewById(R.id.g3j);
        this.LLJJIJIIJIL = (C16F5) viewTd.findViewById(R.id.znr);
        String strLJJJJ = LJJJJ(0L);
        C16F5 c16f5 = this.LLJJIII;
        if (c16f5 != null) {
            c16f5.setText(strLJJJJ);
        }
        LJJJJIZL(!Intrinsics.LJFF(strLJJJJ, CardStruct.IStatusCode.DEFAULT));
        C16F5 c16f52 = this.LLJJIJIIJIL;
        if (c16f52 != null) {
            c16f52.setText(C1850730yGF.LIZJ(0L));
        }
        if (LiveTakeTheStageLeafFixSetting.INSTANCE.getEnable()) {
            User user = this.LLJ;
            ImageModel avatarThumb = user.getAvatarThumb();
            if (avatarThumb != null && (urls = avatarThumb.getUrls()) != null) {
                C1324610kZf c1324610kZfLIZJ = C1819620xS4.LIZ().LIZJ(urls);
                c1324610kZfLIZJ.LJIILIIL = Boolean.TRUE;
                c1324610kZfLIZJ.LJIIIZ = R.drawable.ela;
                c1324610kZfLIZJ.LJJI(this.LLJJ);
            }
            LJJJJJ(0L, 0L, user);
            View view = this.LLJI;
            if (view != null) {
                C786410Ut5.I7(new ACListenerS150S0100000_15(user, 268), view);
            }
        } else {
            User user2 = this.LLJ;
            C16F5 c16f53 = this.LLJIJIL;
            if (c16f53 != null) {
                C500260Jjc.LLFFF(c16f53);
            }
            LinearLayout linearLayout = this.LLJILJIL;
            if (linearLayout != null) {
                C500260Jjc.LJIILIIL(linearLayout);
            }
            String strLJIJJ = C497740JfY.LJIJJ(2131851689, C0KVU.LIZ(user2));
            SpannableStringBuilder spannableStringBuilderLJJJIL = LJJJIL(strLJIJJ);
            int iLJJJ = a0.LJJJ(strLJIJJ, "{avatar}", 0, false, 6);
            if (iLJJJ >= 0 && (resources = this.LL.getResources()) != null) {
                final C986630bmX c986630bmX = new C986630bmX(resources, spannableStringBuilderLJJJIL, iLJJJ, this, user2);
                ((IHostFrescoHelper) C1161920gLG.LIZJ(IHostFrescoHelper.class)).xW1(user2.getAvatarThumb(), new InterfaceC177000m8() { // from class: X.0bmY
                    @Override // X.InterfaceC177000m8
                    public final void LIZ(Bitmap bitmap) {
                        if (bitmap != null) {
                            Bitmap.Config config = bitmap.getConfig();
                            if (bitmap != null && !bitmap.isRecycled() && config != null) {
                                c986630bmX.invoke(bitmap.copy(config, true));
                            }
                        }
                    }
                });
            }
        }
        this.LLIZLLLIL.EQ2(this.LLIZ, TakeTheStageGiftPanelChannel.class, new AwS594S0100000_15(this, 1007));
        return new Pair<>(viewTd, null);
    }

    public final void LJJJJJ(long j, long j2, User user) {
        int iLJI;
        float fMeasureText;
        int iLJIIIZ;
        float fMeasureText2;
        float fMeasureText3;
        float fMeasureText4;
        int i;
        TextPaint paint;
        TextPaint paint2;
        C16F5 c16f5;
        TextPaint paint3;
        C16F5 c16f52;
        View view;
        C16F5 c16f53;
        TextPaint paint4;
        C16F5 c16f54 = this.LLJIJIL;
        if (c16f54 != null) {
            C500260Jjc.LJIILIIL(c16f54);
        }
        LinearLayout linearLayout = this.LLJILJIL;
        if (linearLayout != null) {
            C500260Jjc.LLFFF(linearLayout);
        }
        String strLJIJJ = C497740JfY.LJIJJ(2131851689, C0KVU.LIZ(user));
        int iLJJJ = a0.LJJJ(strLJIJJ, "{avatar}", 0, false, 6);
        if (iLJJJ < 0) {
            return;
        }
        String string = a0.LJLIIIL(strLJIJJ.substring(0, iLJJJ)).toString();
        String string2 = a0.LJLIIIL(strLJIJJ.substring(iLJJJ + 8, strLJIJJ.length())).toString();
        int iLJIIIZ2 = C497740JfY.LJIIIZ(R.dimen.azk);
        if (((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).isPad()) {
            iLJI = (int) ((((double) ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).getPanelWidthInPad()) * 0.7d) - ((double) iLJIIIZ2));
        } else {
            iLJI = C14KS.LJI(this.LL) / 2;
        }
        int iLJIIIZ3 = C497740JfY.LJIIIZ(R.dimen.azn) * 2;
        int iLJIIIZ4 = iLJIIIZ2 + (C497740JfY.LJIIIZ(R.dimen.azl) * 2);
        int iLJIIIZ5 = C497740JfY.LJIIIZ(R.dimen.azj);
        if (!this.LLJJJ && (c16f53 = this.LLJJIII) != null && C500260Jjc.LJJJJIZL(c16f53) && (paint4 = c16f53.getPaint()) != null) {
            fMeasureText = paint4.measureText(LJJJJ(j));
        } else {
            fMeasureText = 0.0f;
        }
        if (!this.LLJJJ && (view = this.LLJJI) != null && C500260Jjc.LJJJJIZL(view)) {
            iLJIIIZ = C497740JfY.LJIIIZ(R.dimen.azo) + iLJIIIZ3;
        } else {
            iLJIIIZ = 0;
        }
        if (!this.LLJJJ && (c16f52 = this.LLJJIJI) != null && C500260Jjc.LJJJJIZL(c16f52)) {
            fMeasureText2 = c16f52.getPaint().measureText(c16f52.getText().toString()) + iLJIIIZ3;
        } else {
            fMeasureText2 = 0.0f;
        }
        if (!this.LLJJJ && (c16f5 = this.LLJJIJIIJIL) != null && C500260Jjc.LJJJJIZL(c16f5) && (paint3 = c16f5.getPaint()) != null) {
            fMeasureText3 = paint3.measureText(C1850730yGF.LIZJ(j2));
        } else {
            fMeasureText3 = 0.0f;
        }
        float f = (((((iLJI - iLJIIIZ4) - iLJIIIZ5) - fMeasureText) - iLJIIIZ) - fMeasureText2) - fMeasureText3;
        float fLJIIIZ = C497740JfY.LJIIIZ(R.dimen.azm);
        float f2 = f - fLJIIIZ;
        int i2 = 0;
        for (Object obj : C1697810uHb.LJIIJJI(new Pair(this.LLJILJILJ, string), new Pair(this.LLJILLL, string2))) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                Pair pair = (Pair) obj;
                AppCompatTextView appCompatTextView = (AppCompatTextView) pair.getFirst();
                String str = (String) pair.getSecond();
                if (appCompatTextView != null && (paint2 = appCompatTextView.getPaint()) != null) {
                    fMeasureText4 = paint2.measureText(str);
                } else {
                    fMeasureText4 = 0.0f;
                }
                CharSequence charSequenceLJJJIL = str;
                if (fMeasureText4 > f2) {
                    if (appCompatTextView != null) {
                        paint = appCompatTextView.getPaint();
                    } else {
                        paint = null;
                    }
                    String string3 = TextUtils.ellipsize(str, paint, f2, TextUtils.TruncateAt.END).toString();
                    CharSequence charSequenceLJJJIL2 = string3;
                    if (appCompatTextView != null) {
                        if (i2 == 0) {
                            charSequenceLJJJIL2 = LJJJIL(string3);
                        }
                        appCompatTextView.setText(charSequenceLJJJIL2);
                    }
                    f2 = 0.0f;
                } else {
                    if (appCompatTextView != null) {
                        if (i2 == 0) {
                            charSequenceLJJJIL = LJJJIL(str);
                        }
                        appCompatTextView.setText(charSequenceLJJJIL);
                    }
                    f2 += (-fMeasureText4) - fLJIIIZ;
                }
                if (appCompatTextView != null) {
                    CharSequence text = appCompatTextView.getText();
                    if (text != null && text.length() > 0) {
                        i = 0;
                    } else {
                        i = 8;
                    }
                    C786410Ut5.LJLLLLLL(i, appCompatTextView);
                }
                i2 = i3;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }

    public C986620bmW(Context context, int i, LifecycleOwner lifecycleOwner, DataChannel dataChannel, User user) {
        super(context, i);
        this.LLIZ = lifecycleOwner;
        this.LLIZLLLIL = dataChannel;
        this.LLJ = user;
        this.LLJJIJIL = true;
    }
}
