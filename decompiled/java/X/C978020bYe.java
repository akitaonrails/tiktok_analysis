package X;

import Y.ALAdapterS11S0100000_15;
import Y.AUListenerS24S0310000_12;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.event.MatchGiftTrayDodgeEvent;
import com.bytedance.android.live.liveinteract.api.event.MatchStartAnimationShowing;
import com.bytedance.android.live.liveinteract.match.business.event.MatchStartAnimationEndEvent;
import com.bytedance.android.live.liveinteract.multimatch.ui.IBottomNoticeAbility;
import com.bytedance.android.live.liveinteract.multimatch.ui.IPKCountDownTitleAbility;
import com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchStartAnimationRemovalSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleComboInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleInfoResponse;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS42S0301000_15;

/* JADX INFO: renamed from: X.0bYe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C978020bYe implements InterfaceC977420bXg {
    public MatchBaseWidget LL;
    public View LLILLJJLI;
    public ViewGroup LLILLL;
    public C1295960jpS LLILZ;
    public C1324720kZq LLILZIL;
    public Bitmap LLIZLLLIL;
    public Bitmap LLJI;
    public Bitmap LLJIJIL;
    public View LLJILJIL;
    public View LLJILJILJ;
    public Drawable LLJILLL;
    public Drawable LLJJ;
    public boolean LLJJI;
    public boolean LLJJIII;
    public final BPEAHandler LLILZLL = new BPEAHandler(Looper.getMainLooper());
    public final C20488215Ey<C973200bQs> LLIZ = new C20488215Ey<>();
    public Map<String, ? extends C1294320jmo> LLJ = C2097608Jq.LJ();

    @Override // X.InterfaceC977420bXg
    public final void LJII(BattleInfoResponse battleInfoResponse) {
    }

    @Override // X.InterfaceC977420bXg
    public final void reset() {
    }

    public final void LJIIJ() {
        C1295960jpS c1295960jpS = this.LLILZ;
        if (c1295960jpS != null) {
            c1295960jpS.clearAnimation();
        }
        C1295960jpS c1295960jpS2 = this.LLILZ;
        if (c1295960jpS2 != null) {
            c1295960jpS2.setFrame(0);
        }
        C1295960jpS c1295960jpS3 = this.LLILZ;
        if (c1295960jpS3 != null) {
            c1295960jpS3.removeAllAnimatorListeners();
        }
        this.LLJ = C2097608Jq.LJ();
    }

    public final void LJIILIIL() {
        DataChannel dataChannel;
        DataChannel dataChannel2;
        View view;
        IBottomNoticeAbility iBottomNoticeAbility;
        IPKCountDownTitleAbility iPKCountDownTitleAbility;
        ViewOnClickListenerC986770bml viewOnClickListenerC986770bmlX1;
        User owner;
        MatchBaseWidget matchBaseWidget = this.LL;
        DataChannel dataChannel3 = matchBaseWidget != null ? matchBaseWidget.dataChannel : null;
        ArrayList<Animator> arrayList = new ArrayList();
        Iterator<C954460awe> it2 = C915980Zwa.LJII().LJIJJ().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            C954460awe next = it2.next();
            MatchBaseWidget matchBaseWidget2 = this.LL;
            if (matchBaseWidget2 != null && (viewOnClickListenerC986770bmlX1 = matchBaseWidget2.x1(next.LJ)) != null) {
                Room roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(dataChannel3);
                boolean z = (roomLJJLIIIIJ == null || (owner = roomLJJLIIIIJ.getOwner()) == null || owner.getId() != next.LJ) ? false : true;
                View viewFindViewById = viewOnClickListenerC986770bmlX1.findViewById(R.id.i2t);
                View viewFindViewById2 = viewOnClickListenerC986770bmlX1.findViewById(R.id.mbg);
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat.addUpdateListener(new AUListenerS24S0310000_12(valueAnimatorOfFloat, z, viewFindViewById, viewFindViewById2, 1));
                arrayList.add(valueAnimatorOfFloat);
            }
        }
        if (!arrayList.isEmpty()) {
            AnimatorSet animatorSet = new AnimatorSet();
            for (Animator animator : arrayList) {
                animator.setDuration(150L);
                animatorSet.play(animator);
            }
            animatorSet.addListener(new ALAdapterS11S0100000_15(dataChannel3, 4));
            animatorSet.start();
        }
        C978500bZQ.LIZIZ("match_in_progress");
        MatchBaseWidget matchBaseWidget3 = this.LL;
        if (matchBaseWidget3 != null && (view = matchBaseWidget3.contentView) != null) {
            Fragment fragmentLIZ = C946803n0.LIZ(view);
            if (fragmentLIZ != null && (iPKCountDownTitleAbility = (IPKCountDownTitleAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLIZ, null), IPKCountDownTitleAbility.class, null)) != null) {
                iPKCountDownTitleAbility.O21();
            }
            Fragment fragmentLIZ2 = C946803n0.LIZ(view);
            if (fragmentLIZ2 != null && (iBottomNoticeAbility = (IBottomNoticeAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLIZ2, null), IBottomNoticeAbility.class, null)) != null) {
                iBottomNoticeAbility.Br0();
            }
        }
        MatchBaseWidget matchBaseWidget4 = this.LL;
        if (matchBaseWidget4 != null && (dataChannel2 = matchBaseWidget4.dataChannel) != null) {
            dataChannel2.FQ2(MatchStartAnimationEndEvent.class);
        }
        C786410Ut5.LJLIIL(2000L, this.LLILZLL, new Runnable() { // from class: X.0bUV
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("MatchStartAnimationComponent@2dd0.onMatchStartAniEnd$2");
                try {
                    C975400bUQ.LIZ(-1, EnumC975440bUU.START_ANIMATION_END.getValue());
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("MatchStartAnimationComponent@2dd0.onMatchStartAniEnd$2");
            }
        });
        this.LLIZ.LIZ.clear();
        MatchBaseWidget matchBaseWidget5 = this.LL;
        if (matchBaseWidget5 == null || (dataChannel = matchBaseWidget5.dataChannel) == null) {
            return;
        }
        dataChannel.zW(MatchStartAnimationShowing.class, Boolean.FALSE);
    }

    @Override // X.InterfaceC977430bXh
    public final void dismiss() {
        ViewGroup viewGroup = this.LLILLL;
        if (viewGroup != null) {
            C786410Ut5.bd(0.0f, viewGroup);
        }
        ViewGroup viewGroup2 = this.LLILLL;
        if (viewGroup2 != null) {
            C786410Ut5.LJLZ(8, viewGroup2);
        }
        C1295960jpS c1295960jpS = this.LLILZ;
        if (c1295960jpS != null) {
            C786410Ut5.LLD(8, c1295960jpS);
        }
        C1324720kZq c1324720kZq = this.LLILZIL;
        if (c1324720kZq != null) {
            C786410Ut5.LLJJIII(c1324720kZq, 8);
        }
        LJIIJ();
        this.LLJJI = false;
        this.LLJJIII = false;
    }

    @Override // X.InterfaceC977430bXh
    public final void onUnload() {
        C20441214yg.LJIIIZ("MatchStartAnimationComponent", "onUnload, stop match start animation and release resources");
        dismiss();
        LJIIJ();
        this.LLJJI = false;
        this.LLJJIII = false;
        this.LLILZ = null;
    }

    public final void LJI() {
        boolean z;
        float f;
        if (C915980Zwa.LJFF().r82() && C915980Zwa.LJII().L6()) {
            z = true;
            f = -((int) C497740JfY.LIZIZ(100.0f));
        } else {
            z = false;
            f = 0.0f;
        }
        ViewGroup viewGroup = this.LLILLL;
        if (viewGroup != null) {
            C786410Ut5.bd(f, viewGroup);
        }
        if (z) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[Enlarge] start animation offsetY=");
            sbLIZ.append(f);
            C20441214yg.LJIIIZ("MatchStartAnimationComponent", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public final void LJIIL() {
        DataChannel dataChannel;
        ViewOnClickListenerC986770bml viewOnClickListenerC986770bmlX1;
        for (C954460awe c954460awe : C915980Zwa.LJII().LJIJJ()) {
            MatchBaseWidget matchBaseWidget = this.LL;
            if (matchBaseWidget != null && (viewOnClickListenerC986770bmlX1 = matchBaseWidget.x1(c954460awe.LJ)) != null) {
                View viewFindViewById = viewOnClickListenerC986770bmlX1.findViewById(R.id.i2t);
                View viewFindViewById2 = viewOnClickListenerC986770bmlX1.findViewById(R.id.mbg);
                C786410Ut5.T4(viewFindViewById, 0.0f);
                C786410Ut5.T4(viewFindViewById2, 0.0f);
                C20441214yg.LJ("lipengwei", "viewAnchorInfo.setVisible alpha to 0 15 ");
            }
        }
        MatchBaseWidget matchBaseWidget2 = this.LL;
        if (matchBaseWidget2 == null || (dataChannel = matchBaseWidget2.dataChannel) == null) {
            return;
        }
        dataChannel.zW(MatchGiftTrayDodgeEvent.class, new C978060bYi(1.0f, 0.3f, 130L));
    }

    @Override // X.InterfaceC977420bXg
    public final void LIZJ(AbstractC986700bme abstractC986700bme) {
        LJI();
    }

    @Override // X.InterfaceC977430bXh
    public final void LIZLLL(MatchBaseWidget matchBaseWidget) {
        ViewGroup viewGroup;
        Drawable drawableLIZIZ;
        C1295960jpS c1295960jpS;
        C20441214yg.LIZIZ("MatchStartAnimationComponent", "onLoad");
        this.LL = matchBaseWidget;
        if (LiveMatchStartAnimationRemovalSetting.INSTANCE.isEnabled()) {
            return;
        }
        Context context = matchBaseWidget.context;
        if (context == null) {
            C20441214yg.LJIIL("MatchStartAnimationComponent", "onLoad: matchWidget.context is null, skip start animation");
            return;
        }
        Bitmap bitmapCreateBitmap = null;
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.gp3, null, false);
        this.LLILLJJLI = viewTd;
        if (viewTd != null) {
            C1295960jpS c1295960jpS2 = (C1295960jpS) viewTd.findViewById(R.id.ntr);
            this.LLILZ = c1295960jpS2;
            if (c1295960jpS2 != null) {
                c1295960jpS2.setCacheComposition(false);
            }
            this.LLILZIL = (C1324720kZq) viewTd.findViewById(R.id.vy5);
        }
        View view = matchBaseWidget.contentView;
        if (view != null) {
            viewGroup = (ViewGroup) view.findViewById(R.id.klg);
        } else {
            viewGroup = null;
        }
        this.LLILLL = viewGroup;
        if (viewGroup != null) {
            C786410Ut5.LJJJJI(viewGroup);
        }
        ViewGroup viewGroup2 = this.LLILLL;
        if (viewGroup2 != null) {
            viewGroup2.addView(this.LLILLJJLI);
        }
        LJI();
        LJIIJ();
        this.LLJJI = false;
        this.LLJJIII = false;
        C1295960jpS c1295960jpS3 = this.LLILZ;
        if (c1295960jpS3 != null) {
            C786410Ut5.LLD(8, c1295960jpS3);
        }
        if (Build.VERSION.SDK_INT > 26 && (c1295960jpS = this.LLILZ) != null) {
            c1295960jpS.setRenderMode(EnumC1295970jpT.HARDWARE);
        }
        Context context2 = matchBaseWidget.context;
        if (context2 != null && (drawableLIZIZ = C800330VaR.LIZIZ(context2, R.drawable.el_)) != null && drawableLIZIZ.getIntrinsicWidth() > 0 && drawableLIZIZ.getIntrinsicHeight() > 0) {
            bitmapCreateBitmap = Bitmap.createBitmap(drawableLIZIZ.getIntrinsicWidth(), drawableLIZIZ.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawableLIZIZ.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawableLIZIZ.draw(canvas);
        }
        this.LLIZLLLIL = bitmapCreateBitmap;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03be  */
    @Override // X.InterfaceC977420bXg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(X.C975960bVK r16) {
        /*
            Method dump skipped, instruction units count: 1286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C978020bYe.LJFF(X.0bVK):void");
    }

    public final void LJIIJJI(BattleComboInfo battleComboInfo, boolean z) {
        Context context;
        View viewSd;
        Drawable drawableLIZIZ;
        Drawable drawable;
        Drawable drawable2;
        String strValueOf;
        MatchBaseWidget matchBaseWidget = this.LL;
        if (matchBaseWidget != null && matchBaseWidget.context != null) {
            if (battleComboInfo != null && Long.valueOf(battleComboInfo.comboCount) != null && battleComboInfo.comboCount != 0) {
                MatchBaseWidget matchBaseWidget2 = this.LL;
                if (matchBaseWidget2 != null && (context = matchBaseWidget2.context) != null) {
                    if (z) {
                        viewSd = this.LLJILJILJ;
                    } else {
                        viewSd = this.LLJILJIL;
                    }
                    if (viewSd == null) {
                        viewSd = C786410Ut5.Sd(R.layout.h84, C786410Ut5.ne(context), null);
                    }
                    C500260Jjc.LLFFF(viewSd);
                    if (z) {
                        this.LLJILJILJ = viewSd;
                    } else {
                        this.LLJILJIL = viewSd;
                    }
                    if (viewSd != null && viewSd.getContext() != null) {
                        if (this.LLJILLL == null) {
                            this.LLJILLL = C800330VaR.LIZIZ(context, R.drawable.f2j);
                        }
                        if (this.LLJJ == null) {
                            this.LLJJ = C800330VaR.LIZIZ(context, R.drawable.f2f);
                        }
                        if (z) {
                            drawableLIZIZ = C800330VaR.LIZIZ(viewSd.getContext(), R.drawable.f58);
                        } else {
                            drawableLIZIZ = C800330VaR.LIZIZ(viewSd.getContext(), R.drawable.f59);
                        }
                        viewSd.setBackground(drawableLIZIZ);
                        TextView textView = (TextView) viewSd.findViewById(R.id.winning_streak_counts_new);
                        if (textView != null) {
                            long j = battleComboInfo.comboCount;
                            if (j > 99) {
                                strValueOf = "99+";
                            } else {
                                strValueOf = String.valueOf(j);
                            }
                            textView.setText(strValueOf);
                        }
                        View viewFindViewById = viewSd.findViewById(R.id.winning_streak_win_new);
                        if (viewFindViewById != null && (drawable2 = this.LLJILLL) != null) {
                            viewFindViewById.setBackground(drawable2);
                        }
                        View viewFindViewById2 = viewSd.findViewById(R.id.winning_streak_x);
                        if (viewFindViewById2 != null && (drawable = this.LLJJ) != null) {
                            viewFindViewById2.setBackground(drawable);
                        }
                        viewSd.measure(View.MeasureSpec.makeMeasureSpec((int) C497740JfY.LIZIZ(84.0f), 1073741824), View.MeasureSpec.makeMeasureSpec((int) C497740JfY.LIZIZ(27.0f), 1073741824));
                        viewSd.layout(0, 0, viewSd.getMeasuredWidth(), viewSd.getMeasuredHeight());
                        int width = viewSd.getWidth();
                        int height = viewSd.getHeight();
                        if (width > 0 && height > 0) {
                            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                            Canvas canvas = new Canvas(bitmapCreateBitmap);
                            canvas.drawColor(0);
                            C842150X1x.LIZIZ(canvas, viewSd);
                            if (z) {
                                this.LLJI = bitmapCreateBitmap;
                                return;
                            } else {
                                this.LLJIJIL = bitmapCreateBitmap;
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            if (z) {
                this.LLJI = null;
                View view = this.LLJILJILJ;
                if (view != null) {
                    C500260Jjc.LJIILIIL(view);
                }
            } else {
                View view2 = this.LLJILJIL;
                if (view2 != null) {
                    C500260Jjc.LJIILIIL(view2);
                }
                this.LLJIJIL = null;
            }
            C20441214yg.LIZIZ("MatchStartAnimationComponent", "combo = null or 0");
        }
    }

    public static List LJIIIIZZ(int i, int i2, boolean z, List list) {
        Object obj;
        if (i <= 2 && i2 <= 2) {
            if (!z) {
                i = i2;
            }
            int i3 = i - 1;
            if (i3 >= 0 && i3 < list.size()) {
                obj = ListProtector.get(list, i3);
            } else {
                obj = C13BV.INSTANCE;
            }
            return (List) obj;
        }
        return C13BV.INSTANCE;
    }

    public static List LJIILJJIL(int i, C1294720jnS c1294720jnS, List list, List list2) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        if (list.size() > 0) {
            obj = ListProtector.get(list, 0);
        } else {
            obj = C13BV.INSTANCE;
        }
        List list3 = (List) obj;
        if (1 < list.size()) {
            obj2 = ListProtector.get(list, 1);
        } else {
            obj2 = C13BV.INSTANCE;
        }
        List list4 = (List) obj2;
        if (2 < list.size()) {
            obj3 = ListProtector.get(list, 2);
        } else {
            obj3 = C13BV.INSTANCE;
        }
        C19719612Di.LJJIIJ(c1294720jnS.LJIIIIZZ, new AwS42S0301000_15(i, (int) list4, (List<String>) obj3, (List<String>) list3, (List<String>) 1), true);
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return C13BV.INSTANCE;
                }
                if (2 < list2.size()) {
                    obj6 = ListProtector.get(list2, 2);
                } else {
                    obj6 = C13BV.INSTANCE;
                }
                return (List) obj6;
            }
            if (1 < list2.size()) {
                obj5 = ListProtector.get(list2, 1);
            } else {
                obj5 = C13BV.INSTANCE;
            }
            return (List) obj5;
        }
        if (list2.size() > 0) {
            obj4 = ListProtector.get(list2, 0);
        } else {
            obj4 = C13BV.INSTANCE;
        }
        return (List) obj4;
    }
}
