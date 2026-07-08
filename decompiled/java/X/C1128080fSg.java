package X;

import Y.ACListenerS86S1100000_17;
import Y.ARunnableS106S0100000_6;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import avg.f;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.gift.model.GiftChallengeProgress;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.GiftPanelBanner;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import com.ss.android.ugc.effectmanager.common.utils.CollectionUtil;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS32S0000100_17;
import kotlin.text.a0;
import mf.a;

/* JADX INFO: renamed from: X.0fSg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1128080fSg extends ConstraintLayout implements C0T8B {
    public final C1117870fCD LL;
    public final C16F5 LLILLJJLI;
    public final ImageView LLILLL;
    public final ImageView LLILZ;
    public final ImageView LLILZIL;
    public final C11NJ LLILZLL;
    public AbstractC1128120fSk LLIZ;

    @Override // X.C0T8B
    public final boolean h() {
        return false;
    }

    public final void setBackground(GiftPanelBanner giftPanelBanner) {
        String str;
        List<String> list;
        ImageModel imageModel = giftPanelBanner.bgImage;
        if (imageModel != null) {
            C1117830fC9.LIZLLL(this.LLILZ, imageModel, getLayoutParams().width, getLayoutParams().height);
            return;
        }
        if (!CollectionUtil.isListEmpty(giftPanelBanner.bgColors)) {
            List<String> list2 = giftPanelBanner.bgColors;
            String str2 = null;
            if (list2 != null) {
                str = (String) ListProtector.get(list2, 0);
            } else {
                str = null;
            }
            List<String> list3 = giftPanelBanner.bgColors;
            if (list3 != null && list3.size() > 1 && (list = giftPanelBanner.bgColors) != null) {
                str2 = (String) ListProtector.get(list, 1);
            }
            if (str != null && C434800H3e.LIZIZ(str)) {
                Drawable drawableLIZ = C434800H3e.LIZ(str, str2);
                if (drawableLIZ == null) {
                    return;
                }
                setBackground(drawableLIZ);
                return;
            }
            setBackgroundResource(R.drawable.dtt);
            return;
        }
        setBackgroundResource(R.drawable.dtt);
    }

    public final void setBannerClickListener(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setBannerClickListener, schemaUrl = ");
        sbLIZ.append(str);
        C20441214yg.LIZIZ("GiftChallengePanel", C2188811AlT.LIZIZ(sbLIZ));
        View.OnClickListener aCListenerS86S1100000_17 = new ACListenerS86S1100000_17(this, str, 1);
        if (C1848410yCV.LIZ) {
            aCListenerS86S1100000_17 = new f(aCListenerS86S1100000_17);
        }
        a aVar = new a(aCListenerS86S1100000_17);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(this);
        }
        setOnClickListener(aVar);
    }

    public C1128080fSg(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void e0(String str, AbstractC1128120fSk abstractC1128120fSk) {
        int iLIZ = C0DT3.LIZ(C12ES.LJIIJ(getContext()) - ((int) C1117830fC9.LIZJ(64)), this.LLILLJJLI, str);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("supportLongText lineCount ");
        sbLIZ.append(iLIZ);
        C20441214yg.LJIIIZ("GiftChallengePanel", C2188811AlT.LIZIZ(sbLIZ));
        if (iLIZ > 1) {
            ImageView imageView = this.LLILLL;
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            if (layoutParams != null) {
                C19ME c19me = (C19ME) layoutParams;
                c19me.startToStart = -1;
                c19me.endToStart = this.LLILZIL.getId();
                C786410Ut5.W5(imageView, c19me);
                C16F5 c16f5 = this.LLILLJJLI;
                ViewGroup.LayoutParams layoutParams2 = c16f5.getLayoutParams();
                if (layoutParams2 != null) {
                    C19ME c19me2 = (C19ME) layoutParams2;
                    c19me2.endToStart = this.LLILLL.getId();
                    c19me2.setMarginEnd(0);
                    C786410Ut5.W5(c16f5, c19me2);
                    this.LLILLJJLI.getLayoutParams().width = 0;
                    this.LLILLJJLI.setHorizontalFadingEdgeEnabled(true);
                    this.LLILLJJLI.setFadingEdgeLength((int) C497740JfY.LIZIZ(22.0f));
                    if (abstractC1128120fSk instanceof C1128150fSn) {
                        this.LLILLJJLI.setEllipsize(TextUtils.TruncateAt.END);
                        return;
                    }
                    if (abstractC1128120fSk instanceof C1128170fSp) {
                        this.LLILLJJLI.setEllipsize(TextUtils.TruncateAt.MARQUEE);
                        this.LLILLJJLI.setSelected(true);
                        this.LLILLJJLI.setMarqueeRepeatLimit(-1);
                        return;
                    } else {
                        this.LLILLJJLI.setEllipsize(TextUtils.TruncateAt.MARQUEE);
                        this.LLILLJJLI.setSelected(true);
                        this.LLILLJJLI.setMarqueeRepeatLimit(-1);
                        return;
                    }
                }
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        this.LLILLJJLI.getLayoutParams().width = -2;
        C16F5 c16f52 = this.LLILLJJLI;
        ViewGroup.LayoutParams layoutParams3 = c16f52.getLayoutParams();
        if (layoutParams3 != null) {
            C19ME c19me3 = (C19ME) layoutParams3;
            c19me3.endToEnd = -1;
            c19me3.endToStart = -1;
            C786410Ut5.W5(c16f52, c19me3);
            this.LLILLJJLI.setHorizontalFadingEdgeEnabled(false);
            this.LLILLJJLI.setFadingEdgeLength(0);
            this.LLILLJJLI.requestLayout();
            ImageView imageView2 = this.LLILLL;
            ViewGroup.LayoutParams layoutParams4 = imageView2.getLayoutParams();
            if (layoutParams4 != null) {
                C19ME c19me4 = (C19ME) layoutParams4;
                c19me4.startToEnd = this.LLILLJJLI.getId();
                c19me4.endToStart = -1;
                C786410Ut5.W5(imageView2, c19me4);
                this.LLILLL.requestLayout();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
    }

    public final void h0(int i, String str) {
        String strK4 = C786410Ut5.k4(Locale.US, str, Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
        SpannableString spannableString = new SpannableString(strK4);
        try {
            int iLJJJ = a0.LJJJ(strK4, String.valueOf(i), 0, false, 6);
            C786410Ut5.p2(spannableString, new ForegroundColorSpan(-1), iLJJJ, String.valueOf(i).length() + iLJJJ, 33);
            C786410Ut5.p2(spannableString, new C444930HcZ(C1119920fFW.LIZJ(this.LLILLJJLI.getTextSize(), OppoPermissionPopupMaskDelayExp.DEFAULT, getContext())), iLJJJ, String.valueOf(i).length() + iLJJJ, 33);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LIZIZ();
        }
        this.LLILLJJLI.setText(spannableString);
    }

    public C1128080fSg(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLILZLL = new C11NJ();
        ViewGroup.inflate(context, R.layout.hz_, this);
        this.LLILZIL = (ImageView) findViewById(R.id.l65);
        this.LLILLJJLI = (C16F5) findViewById(R.id.z3g);
        this.LL = (C1117870fCD) findViewById(R.id.q66);
        this.LLILLL = (ImageView) findViewById(R.id.l6u);
        this.LLILZ = (ImageView) findViewById(R.id.l_x);
    }

    public final void i0(final long j, GiftChallengeProgress giftChallengeProgress, boolean z) {
        this.LL.clearAnimation();
        AbstractC1128120fSk c1128140fSm = null;
        if (giftChallengeProgress != null) {
            boolean zBooleanValue = ((Boolean) new AwS32S0000100_17(j, 1).invoke(Long.valueOf(j))).booleanValue();
            final int i = giftChallengeProgress.status;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        c1128140fSm = new AbstractC1128120fSk(j, i) { // from class: X.0fSq
                            public final long LIZ;
                            public final int LIZIZ;

                            @Override // X.AbstractC1128120fSk
                            public final long LIZ() {
                                return this.LIZ;
                            }

                            @Override // X.AbstractC1128120fSk
                            public final int LIZIZ() {
                                return this.LIZIZ;
                            }

                            {
                                super(j, i);
                                this.LIZ = j;
                                this.LIZIZ = i;
                            }
                        };
                    } else {
                        c1128140fSm = new AbstractC1128120fSk(j, i) { // from class: X.0fSp
                            public final long LIZ;
                            public final int LIZIZ;

                            @Override // X.AbstractC1128120fSk
                            public final long LIZ() {
                                return this.LIZ;
                            }

                            @Override // X.AbstractC1128120fSk
                            public final int LIZIZ() {
                                return this.LIZIZ;
                            }

                            {
                                super(j, i);
                                this.LIZ = j;
                                this.LIZIZ = i;
                            }
                        };
                    }
                } else {
                    C1128160fSo c1128160fSoLIZ = C1128100fSi.LIZ(giftChallengeProgress);
                    if (zBooleanValue) {
                        long j2 = 0;
                        int i2 = 0;
                        for (GiftChallengeProgress.StageData stageData : giftChallengeProgress.stageData) {
                            int i3 = i2 + 1;
                            if (i2 >= 0) {
                                GiftChallengeProgress.StageData stageData2 = stageData;
                                j2 += stageData2.totalPoints;
                                if (stageData2.giftId == j) {
                                    break;
                                } else {
                                    i2 = i3;
                                }
                            } else {
                                C1697810uHb.LJIJI();
                                throw null;
                            }
                        }
                        c1128140fSm = new C1128130fSl(j, (int) (j2 - giftChallengeProgress.currentPoints), c1128160fSoLIZ.LIZIZ, giftChallengeProgress.status);
                    } else {
                        c1128140fSm = new C1128150fSn(j, c1128160fSoLIZ, giftChallengeProgress.status);
                    }
                }
            } else {
                c1128140fSm = new C1128140fSm(j, zBooleanValue, C1128100fSi.LIZ(giftChallengeProgress).LIZIZ, giftChallengeProgress.status);
            }
        }
        C1128090fSh c1128090fSh = new C1128090fSh(c1128140fSm, this, j, z);
        AbstractC1128120fSk abstractC1128120fSk = this.LLIZ;
        if (abstractC1128120fSk != null) {
            if ((abstractC1128120fSk instanceof C1128150fSn) && (c1128140fSm instanceof C1128150fSn)) {
                C1128150fSn c1128150fSn = (C1128150fSn) abstractC1128120fSk;
                if (c1128150fSn.LIZIZ.LIZIZ.LIZIZ != ((C1128150fSn) c1128140fSm).LIZIZ.LIZIZ.LIZIZ) {
                    Gift giftFindGiftById = GiftManager.inst().findGiftById(j);
                    if (giftFindGiftById == null) {
                        c1128090fSh.invoke();
                        return;
                    }
                    GiftPanelBanner giftPanelBanner = giftFindGiftById.giftPanelBanner;
                    if (giftPanelBanner != null) {
                        setBackground(giftPanelBanner);
                    }
                    C1128160fSo c1128160fSo = c1128150fSn.LIZIZ;
                    j0(c1128160fSo.LIZJ, c1128160fSo.LIZ + giftFindGiftById.diamondCount, 0L, false, c1128090fSh);
                    return;
                }
            }
            c1128090fSh.invoke();
            return;
        }
        c1128090fSh.invoke();
    }

    public final void j0(float f, float f2, final long j, boolean z, final Function0<Unit> function0) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateProgressBarFromSend  maxProgress ");
        sbLIZ.append(f);
        sbLIZ.append(" levelProgress ");
        sbLIZ.append(f2);
        sbLIZ.append(" previewProgress ");
        sbLIZ.append(j);
        sbLIZ.append(" isGiftChange ");
        sbLIZ.append(z);
        C20441214yg.LJIIIZ("GiftChallengePanel", C2188811AlT.LIZIZ(sbLIZ));
        if (z) {
            this.LL.LIZIZ(0L);
            this.LL.setLevelProgress(0.0f);
        }
        this.LL.setMaxProgress(f);
        this.LL.setLevelProgressColor(-1);
        C1117870fCD c1117870fCD = this.LL;
        c1117870fCD.LIZ(c1117870fCD.LLILZLL, f2, new InterfaceC1117910fCH() { // from class: X.0fSd
            @Override // X.InterfaceC1117910fCH
            public final void LIZ() {
                this.LIZ.LL.LIZIZ(j);
                C786410Ut5.LJLIIL(500L, new BPEAHandler(Looper.getMainLooper()), new ARunnableS106S0100000_6((Function0) function0, 28));
            }
        });
    }
}
