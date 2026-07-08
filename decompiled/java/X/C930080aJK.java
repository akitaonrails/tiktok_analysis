package X;

import Y.ACListenerS150S0100000_15;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS381S0200000_15;

/* JADX INFO: renamed from: X.0aJK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C930080aJK extends AbstractC960470b6L<C930130aJP> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public final Function1<Integer, Unit> LL;
    public final View LLILLJJLI;
    public final ViewGroup LLILLL;
    public final C16F5 LLILZ;
    public final ImageView LLILZIL;
    public final C16F5 LLILZLL;
    public final LiveIconView LLIZ;
    public final C304201Fw LLIZLLLIL;
    public final boolean LLJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C930080aJK.class, "multiGuestDataHolder", "getMultiGuestDataHolder()Lcom/bytedance/android/live/liveinteract/multiguestv3/main/common/MultiGuestDataHolder;", 0);
        C13LE.LIZ.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public final void L5() {
        if (C930540aK4.LJJIJ()) {
            return;
        }
        C923330a8R c923330a8R = C923330a8R.LIZ;
        if (C923330a8R.LJFF()) {
            return;
        }
        C12ES.LJIILL(0, this.LLILZ);
        this.LLILZ.setTextSize(15.0f);
        C16F5 c16f5 = this.LLILZ;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ezq, this.itemView.getContext());
        c16f5.setTextColor(numLIZJ != null ? numLIZJ.intValue() : 0);
        this.LLILLL.getLayoutParams().height = -2;
    }

    @Override // X.AbstractC960470b6L
    public final void I5(int i, Object obj) {
        int iIntValue;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLIZIZ;
        C930130aJP c930130aJP = (C930130aJP) obj;
        int i2 = 0;
        if (this.LLJ) {
            C500260Jjc.LJIILIIL(this.LLILLJJLI);
            View view = this.itemView;
            if (i != 0) {
                C426750GoL.LJIIIZ(view, 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), 0, 0, false, 16);
            } else {
                view = view;
                i2 = 0;
                C426750GoL.LJIIIZ(view, 0, 0, 0, 0, false, 16);
            }
            view.setBackground(null);
            this.LLILLL.setBackground(C800330VaR.LIZIZ(this.itemView.getContext(), R.drawable.dk2));
        } else {
            View view2 = this.itemView;
            view2.setPadding(view2.getPaddingLeft(), this.itemView.getPaddingTop(), this.itemView.getPaddingRight(), C439101nJ.LIZ(8));
        }
        this.LLILZ.setText(c930130aJP.LIZ);
        C439101nJ.LJI(this.LLILZLL);
        C439101nJ.LJI(this.LLIZ);
        C439101nJ.LJI(this.LLILZIL);
        this.LLILZ.setTextSize(13.0f);
        C16F5 c16f5 = this.LLILZ;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1k, this.itemView.getContext());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        c16f5.setTextColor(iIntValue);
        switch (c930130aJP.LIZIZ) {
            case 0:
                L5();
                C925640aCA.LIZIZ = getAbsoluteAdapterPosition();
                C439101nJ.LJI(this.LLILZIL);
                if (C922760a7W.LIZJ()) {
                    C304201Fw c304201Fw = this.LLIZLLLIL;
                    InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJI;
                    MultiGuestDataHolder multiGuestDataHolder = (MultiGuestDataHolder) c304201Fw.LIZ();
                    if (multiGuestDataHolder != null && (multiLiveAnchorPanelSettingsLIZIZ = multiGuestDataHolder.LIZIZ()) != null) {
                        int i3 = multiLiveAnchorPanelSettingsLIZIZ.applierSortSetting;
                        C118300cf c118300cf = new C118300cf();
                        c118300cf.element = -1;
                        C12ES.LJIILL(i2, this.LLILZLL);
                        C12ES.LJIILL(i2, this.LLIZ);
                        if (i3 != 0) {
                            if (i3 == 1) {
                                this.LLILZLL.setText(C497740JfY.LJIJI(2131843272));
                                c118300cf.element = i2;
                            }
                        } else {
                            this.LLILZLL.setText(C497740JfY.LJIJI(2131843271));
                            c118300cf.element = 1;
                        }
                        if (c118300cf.element != -1) {
                            C500260Jjc.LJLIIIL(500L, this.LLILZLL, new AwS381S0200000_15(this, c118300cf, 16));
                            C500260Jjc.LJLIIIL(500L, this.LLIZ, new AwS381S0200000_15(this, c118300cf, 17));
                        }
                        break;
                    }
                }
                break;
            case 1:
                L5();
                C439101nJ.LJI(this.LLILLJJLI);
                break;
            case 2:
                if (this.LLJ) {
                    L5();
                }
                C12ES.LJIILL(i2, this.LLILZIL);
                C786410Ut5.Q7(this.LLILZIL, new ACListenerS150S0100000_15(this, 23));
                break;
            case 3:
                L5();
                C439101nJ.LJI(this.LLILLJJLI);
                break;
            case 4:
                C12ES.LJIILL(i2, this.LLILZIL);
                C786410Ut5.Q7(this.LLILZIL, new ACListenerS150S0100000_15(this, 24));
                break;
            case 5:
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
            default:
                if (this.LLJ) {
                    L5();
                }
                C439101nJ.LJI(this.LLILZIL);
                break;
            case 6:
                C439101nJ.LJI(this.LLILZIL);
                this.itemView.setBackgroundColor(i2);
                this.LLILLL.setBackgroundResource(i2);
                break;
            case 7:
                L5();
                C439101nJ.LJI(this.LLILLJJLI);
                break;
            case 8:
                L5();
                C439101nJ.LJI(this.LLILLJJLI);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                L5();
                C439101nJ.LJI(this.LLILLJJLI);
                C923190a8D.LIZLLL();
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                if (this.LLJ) {
                    C439101nJ.LJI(this.LLILZIL);
                    C439101nJ.LJI(this.LLILZ);
                    C500260Jjc.LJJZ((int) C497740JfY.LIZIZ(16.0f), this.LLILLL);
                }
                break;
        }
    }

    public C930080aJK(View view, Function1 function1, C930100aJM c930100aJM) {
        super(view);
        this.LL = function1;
        this.LLILLJJLI = view.findViewById(R.id.title_shadow);
        this.LLILLL = (ViewGroup) view.findViewById(R.id.y0y);
        this.LLILZ = (C16F5) view.findViewById(R.id.zrm);
        this.LLILZIL = (ImageView) view.findViewById(R.id.tbv);
        this.LLILZLL = (C16F5) view.findViewById(R.id.uhr);
        this.LLIZ = (LiveIconView) view.findViewById(R.id.uhq);
        this.LLIZLLLIL = new C304201Fw("MULTI_GUEST_DATA_HOLDER");
        this.LLJ = C930540aK4.LJIJJLI();
    }
}
