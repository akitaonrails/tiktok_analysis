package X;

import Y.ALAdapterS13S0100000_17;
import Y.AfS153S0200000_17;
import Y.AfS186S0100000_17;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.boostcard.LiveGiftBoostCardUserStatusResponse;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.event.LiveBoostCardFreshChannel;
import com.bytedance.android.livesdk.livesetting.rank.AudienceListPromoteAwarenessTypeSetting;
import com.bytedance.android.livesdk.rank.impl.boostcard.LiveBoostCardApi;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveGiftBoostCardRoomStatus;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AFwS205S0000000_17;
import kotlin.jvm.internal.AwS383S0200000_17;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0eNB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC1086230eNB implements InterfaceC1141530foN {
    public final InterfaceC1086210eN9 LL;
    public View LLILLJJLI;
    public View LLILLL;
    public View LLILZ;
    public View LLILZIL;
    public TextView LLILZLL;
    public TextView LLIZ;
    public C1295960jpS LLIZLLLIL;
    public C1324720kZq LLJ;
    public TextView LLJI;
    public LiveIconView LLJIJIL;
    public long LLJILJIL;
    public final boolean LLJILJILJ = C497740JfY.LJJ();
    public final int LLJILLL;
    public final float LLJJ;
    public final float LLJJI;
    public final C01GW LLJJIII;
    public final C11NJ LLJJIJI;
    public DataChannel LLJJIJIIJIL;
    public long LLJJIJIL;
    public long LLJJJ;
    public int LLJJJIL;
    public boolean LLJJJJ;
    public final ArrayList<Long> LLJJJJJIL;
    public long LLJJJJLIIL;

    public abstract Map<String, String> LJ();

    public final void LIZ() {
        if (C1086280eNG.LIZIZ.LIZ.length() == 0 || this.LLJ == null) {
            C1086300eNI.LIZIZ();
            return;
        }
        C1324720kZq c1324720kZq = this.LLJ;
        if (c1324720kZq != null) {
            C1143680frq.LIZLLL(c1324720kZq, "tiktok_live_interaction_demand_1", C1086280eNG.LIZIZ.LIZ);
        }
        C1324720kZq c1324720kZq2 = this.LLJ;
        if (c1324720kZq2 != null) {
            C786410Ut5.LLJJIII(c1324720kZq2, 0);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.LLJ, (Property<C1324720kZq, Float>) View.ALPHA, 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(200L);
        objectAnimatorOfFloat.setInterpolator(LIZLLL());
        AnimatorSet animatorSet2 = new AnimatorSet();
        AnimatorSet animatorSet3 = new AnimatorSet();
        AnimatorSet animatorSet4 = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.LLJ, (Property<C1324720kZq, Float>) View.SCALE_X, 6.0f, 6.0f);
        objectAnimatorOfFloat2.setDuration(80L);
        objectAnimatorOfFloat2.setInterpolator(LIZLLL());
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.LLJ, (Property<C1324720kZq, Float>) View.SCALE_Y, 6.0f, 6.0f);
        objectAnimatorOfFloat3.setDuration(80L);
        objectAnimatorOfFloat3.setInterpolator(LIZLLL());
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.LLJ, (Property<C1324720kZq, Float>) View.SCALE_X, 6.0f, 4.0f);
        objectAnimatorOfFloat4.setDuration(120L);
        objectAnimatorOfFloat4.setInterpolator(LIZLLL());
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(this.LLJ, (Property<C1324720kZq, Float>) View.SCALE_Y, 6.0f, 4.0f);
        objectAnimatorOfFloat5.setDuration(120L);
        objectAnimatorOfFloat5.setInterpolator(LIZLLL());
        animatorSet3.playTogether(objectAnimatorOfFloat2, objectAnimatorOfFloat3);
        animatorSet4.playTogether(objectAnimatorOfFloat4, objectAnimatorOfFloat5);
        animatorSet2.playSequentially(animatorSet3, animatorSet4);
        ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(this.LLJ, (Property<C1324720kZq, Float>) View.TRANSLATION_Y, C497740JfY.LIZIZ(160.0f), C497740JfY.LIZIZ(160.0f));
        objectAnimatorOfFloat6.setDuration(200L);
        objectAnimatorOfFloat6.setInterpolator(LIZLLL());
        ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(this.LLJ, (Property<C1324720kZq, Float>) View.TRANSLATION_X, this.LLJILLL * C497740JfY.LIZIZ(150.0f), (-this.LLJILLL) * C497740JfY.LIZIZ(25.0f));
        objectAnimatorOfFloat7.setDuration(200L);
        objectAnimatorOfFloat7.setInterpolator(LIZLLL());
        animatorSet.playTogether(objectAnimatorOfFloat, animatorSet2, objectAnimatorOfFloat6, objectAnimatorOfFloat7);
        animatorSet.addListener(new ALAdapterS13S0100000_17(this, 23));
        animatorSet.start();
    }

    public final C2268791DrB LIZLLL() {
        return (C2268791DrB) this.LLJJIII.getValue();
    }

    public void LJI() {
        C1086250eND c1086250eND = C1086280eNG.LIZIZ;
        c1086250eND.LJI = false;
        c1086250eND.LJFF = true;
        C1086300eNI.LIZ(new C1086310eNJ(3));
    }

    public void onDestroy() {
        ViewGroup.LayoutParams layoutParams;
        C1548820qPI.LJIIIIZZ("live_boost_use_card", this);
        this.LLJJIJI.LJ();
        C1086280eNG.LIZ = 0L;
        C1086280eNG.LIZIZ = new C1086250eND();
        ((LinkedHashMap) C1086280eNG.LIZJ).clear();
        C1086300eNI.LIZ = false;
        C1086300eNI.LIZIZ.clear();
        View view = this.LLILLJJLI;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        View view2 = this.LLILZIL;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(8, view2);
        }
        View view3 = this.LLILLL;
        if (view3 != null && (layoutParams = view3.getLayoutParams()) != null) {
            layoutParams.width = 0;
        }
        TextView textView = this.LLILZLL;
        if (textView != null) {
            C786410Ut5.LLIL(textView, 8);
        }
        TextView textView2 = this.LLIZ;
        if (textView2 != null) {
            C786410Ut5.LLIL(textView2, 8);
        }
        C1295960jpS c1295960jpS = this.LLIZLLLIL;
        if (c1295960jpS != null) {
            C786410Ut5.LLD(8, c1295960jpS);
        }
        LiveIconView liveIconView = this.LLJIJIL;
        if (liveIconView != null) {
            C786410Ut5.LLJJIJIL(liveIconView, 8);
        }
        C1324720kZq c1324720kZq = this.LLJ;
        if (c1324720kZq != null) {
            C786410Ut5.LLJJIII(c1324720kZq, 8);
        }
        this.LLJJJIL = 0;
        this.LLJJJJ = false;
        this.LLJJJJJIL.clear();
    }

    public final void LJIIIIZZ() {
        if (C1086280eNG.LIZIZ()) {
            long jCurrentTimeMillis = this.LLJJJJLIIL > 0 ? (System.currentTimeMillis() - this.LLJJJJLIIL) / ((long) LSPassThroughRecordSizeConfig.DEFAULT) : 0L;
            boolean zEnableCoolDown = AudienceListPromoteAwarenessTypeSetting.INSTANCE.enableCoolDown();
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_liveroom_promote_effect_show");
            c474500IjALIZ.LJIL();
            c474500IjALIZ.LJJII(zEnableCoolDown ? "periodic" : "permanent", "effect_show_strategy");
            c474500IjALIZ.LJJII(jCurrentTimeMillis > 0 ? Long.valueOf(jCurrentTimeMillis) : null, "between_show_sec");
            c474500IjALIZ.LIZ();
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("top_right_showing", true);
        C389001fE.LIZ("live_promote_event", jSONObject, System.currentTimeMillis(), false);
    }

    public final void LJIIIZ() {
        this.LLJJJJLIIL = System.currentTimeMillis();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("top_right_showing", false);
        C389001fE.LIZ("live_promote_event", jSONObject, System.currentTimeMillis(), false);
    }

    public AbstractC1086230eNB(C1105400es6 c1105400es6) {
        int i;
        this.LL = c1105400es6;
        if (C497740JfY.LJJ()) {
            i = -1;
        } else {
            i = 1;
        }
        this.LLJILLL = i;
        this.LLJJ = C497740JfY.LIZIZ(60.0f);
        this.LLJJI = C497740JfY.LIZIZ(24.0f);
        this.LLJJIII = C292401Bi.LIZ(AFwS205S0000000_17.get$arr$(138));
        this.LLJJIJI = new C11NJ();
        this.LLJJJJJIL = new ArrayList<>();
    }

    public static String LIZJ(long j) {
        boolean z;
        if (10000 <= j && j < 1000000) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            double d = j / ((double) LSPassThroughRecordSizeConfig.DEFAULT);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(C786410Ut5.k4(Locale.getDefault(), "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(d)}, 1)));
            sbLIZ.append('K');
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        if (j >= 1000000) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(C786410Ut5.k4(Locale.getDefault(), "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(j / ((double) 1000000))}, 1)));
            sbLIZ2.append('M');
            return C2188811AlT.LIZIZ(sbLIZ2);
        }
        if (j >= 1000) {
            StringBuffer stringBuffer = new StringBuffer(String.valueOf(j));
            stringBuffer.insert(1, ',');
            return stringBuffer.toString();
        }
        return String.valueOf(j);
    }

    public final void LIZIZ(long j) {
        String string;
        String strLJIJJ;
        CharSequence text;
        if (this.LLJJJ < j) {
            this.LLJJJ = j;
        }
        TextView textView = this.LLIZ;
        if (textView != null && (text = textView.getText()) != null) {
            string = text.toString();
        } else {
            string = null;
        }
        int measuredWidth = 0;
        if (!this.LLJILJILJ) {
            strLJIJJ = C497740JfY.LJIJJ(2131843793, LIZJ(this.LLJJJ));
        } else {
            strLJIJJ = C497740JfY.LJIJJ(2131843794, LIZJ(this.LLJJJ));
        }
        if (Intrinsics.LJFF(strLJIJJ, string)) {
            return;
        }
        TextView textView2 = this.LLIZ;
        if (textView2 != null) {
            textView2.setText(strLJIJJ);
        }
        TextView textView3 = this.LLIZ;
        if (textView3 != null) {
            textView3.measure(0, 0);
        }
        TextView textView4 = this.LLIZ;
        if (textView4 != null) {
            measuredWidth = textView4.getMeasuredWidth();
        }
        if (measuredWidth > ((int) C497740JfY.LIZIZ(48.0f))) {
            TextView textView5 = this.LLIZ;
            if (textView5 != null) {
                textView5.setTextSize(9.0f);
                ViewGroup.LayoutParams layoutParams = textView5.getLayoutParams();
                layoutParams.width = (int) C497740JfY.LIZIZ(48.0f);
                C786410Ut5.g6(textView5, layoutParams);
            }
        } else {
            TextView textView6 = this.LLIZ;
            if (textView6 != null) {
                textView6.setTextSize(11.0f);
                ViewGroup.LayoutParams layoutParams2 = textView6.getLayoutParams();
                layoutParams2.width = measuredWidth;
                C786410Ut5.g6(textView6, layoutParams2);
            }
        }
        this.LL.LIZJ();
    }

    public void LJII(boolean z) {
        long jLIZ = C1086280eNG.LIZIZ.LIZIZ - C158B.LIZ();
        if (jLIZ <= 0) {
            C1086280eNG.LIZIZ.LJI = false;
            return;
        }
        C1086280eNG.LIZIZ.LJI = true;
        C1086250eND c1086250eND = C1086280eNG.LIZIZ;
        String str = c1086250eND.LIZJ;
        String str2 = c1086250eND.LJ;
        String str3 = c1086250eND.LIZLLL;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("boost_card_start_show");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(str, "task_id");
        c474500IjALIZ.LJJII(str2, "card_id");
        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
        c474500IjALIZ.LJJII(str3, "task_source");
        c474500IjALIZ.LIZ();
        if (z) {
            DataChannel dataChannel = this.LLJJIJIIJIL;
            if (dataChannel != null) {
                dataChannel.zW(LiveBoostCardFreshChannel.class, new C1086310eNJ(1));
            }
        } else {
            C1086300eNI.LIZ(new C1086310eNJ(1));
        }
        this.LLJJIJI.LIZ(C11NZ.LJLJJLL(jLIZ, TimeUnit.MILLISECONDS).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS186S0100000_17(this, 84)));
    }

    public final void LJIIJ(long j) {
        if (this.LLJJJJ) {
            int i = this.LLJJJIL + 1;
            this.LLJJJIL = i;
            if (i >= 10) {
                this.LLJJJIL = 0;
                this.LLJJJJJIL.add(Long.valueOf(j));
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("points", this.LLJJJJJIL.toString());
                C389001fE.LIZ("live_boost_card_event", jSONObject, System.currentTimeMillis(), false);
            }
        }
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        int iAsInt;
        String strAsString;
        String strAsString2;
        int iAsInt2;
        InterfaceC1871820yoG interfaceC1871820yoG;
        InterfaceC1871820yoG interfaceC1871820yoG2;
        String strAsString3;
        InterfaceC1871820yoG interfaceC1871820yoG3;
        InterfaceC1871820yoG interfaceC1871820yoG4;
        InterfaceC1871820yoG interfaceC1871820yoG5;
        if (Intrinsics.LJFF("live_boost_use_card", c262100zr.LIZ)) {
            C1086250eND c1086250eND = C1086280eNG.LIZIZ;
            InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
            if (interfaceC1107590evd != null && (interfaceC1871820yoG5 = interfaceC1107590evd.get("boost_end_time")) != null) {
                iAsInt = interfaceC1871820yoG5.asInt();
            } else {
                iAsInt = 0;
            }
            c1086250eND.LIZIZ = ((long) iAsInt) * 1000;
            C1086250eND c1086250eND2 = C1086280eNG.LIZIZ;
            InterfaceC1107590evd interfaceC1107590evd2 = c262100zr.LIZIZ;
            String str = "";
            if (interfaceC1107590evd2 == null || (interfaceC1871820yoG4 = interfaceC1107590evd2.get("image_path")) == null || (strAsString = interfaceC1871820yoG4.asString()) == null) {
                strAsString = "";
            }
            c1086250eND2.LIZ = strAsString;
            C1086250eND c1086250eND3 = C1086280eNG.LIZIZ;
            InterfaceC1107590evd interfaceC1107590evd3 = c262100zr.LIZIZ;
            if (interfaceC1107590evd3 == null || (interfaceC1871820yoG3 = interfaceC1107590evd3.get("card_id")) == null || (strAsString2 = interfaceC1871820yoG3.asString()) == null) {
                strAsString2 = "";
            }
            c1086250eND3.LJ = strAsString2;
            C1086250eND c1086250eND4 = C1086280eNG.LIZIZ;
            InterfaceC1107590evd interfaceC1107590evd4 = c262100zr.LIZIZ;
            if (interfaceC1107590evd4 != null && (interfaceC1871820yoG2 = interfaceC1107590evd4.get("task_id")) != null && (strAsString3 = interfaceC1871820yoG2.asString()) != null) {
                str = strAsString3;
            }
            c1086250eND4.LIZJ = str;
            C1086250eND c1086250eND5 = C1086280eNG.LIZIZ;
            InterfaceC1107590evd interfaceC1107590evd5 = c262100zr.LIZIZ;
            if (interfaceC1107590evd5 != null && (interfaceC1871820yoG = interfaceC1107590evd5.get("task_source")) != null) {
                iAsInt2 = interfaceC1871820yoG.asInt();
            } else {
                iAsInt2 = 0;
            }
            c1086250eND5.LIZLLL = String.valueOf(iAsInt2);
            LJII(false);
        }
    }

    public void LJFF(View view, LifecycleOwner lifecycleOwner, DataChannel dataChannel) {
        View viewFindViewById;
        View viewFindViewById2;
        View viewFindViewById3;
        View viewFindViewById4;
        TextView textView;
        TextView textView2;
        C1295960jpS c1295960jpS;
        C1324720kZq c1324720kZq;
        TextView textView3;
        long jLongValue;
        LiveIconView liveIconView;
        ViewGroup.LayoutParams layoutParams;
        FrameLayout.LayoutParams layoutParams2;
        ViewGroup.LayoutParams layoutParams3;
        boolean zBooleanValue;
        boolean z;
        LiveGiftBoostCardRoomStatus liveGiftBoostCardRoomStatus;
        String str;
        Object objValueOf;
        String str2;
        LiveGiftBoostCardRoomStatus liveGiftBoostCardRoomStatus2;
        LiveGiftBoostCardRoomStatus liveGiftBoostCardRoomStatus3;
        LiveGiftBoostCardRoomStatus liveGiftBoostCardRoomStatus4;
        LiveGiftBoostCardRoomStatus liveGiftBoostCardRoomStatus5;
        LiveGiftBoostCardRoomStatus liveGiftBoostCardRoomStatus6;
        Boolean bool;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        FrameLayout.LayoutParams layoutParams4;
        Long l;
        Room room = null;
        if (view != null) {
            viewFindViewById = view.findViewById(R.id.rgt);
        } else {
            viewFindViewById = null;
        }
        this.LLILLJJLI = viewFindViewById;
        if (view != null) {
            viewFindViewById2 = view.findViewById(R.id.rgu);
        } else {
            viewFindViewById2 = null;
        }
        this.LLILLL = viewFindViewById2;
        if (view != null) {
            viewFindViewById3 = view.findViewById(R.id.viewers_icon);
        } else {
            viewFindViewById3 = null;
        }
        this.LLILZ = viewFindViewById3;
        if (view != null) {
            viewFindViewById4 = view.findViewById(R.id.rgv);
        } else {
            viewFindViewById4 = null;
        }
        this.LLILZIL = viewFindViewById4;
        if (view != null) {
            textView = (TextView) view.findViewById(R.id.rgy);
        } else {
            textView = null;
        }
        this.LLILZLL = textView;
        if (view != null) {
            textView2 = (TextView) view.findViewById(R.id.rgs);
        } else {
            textView2 = null;
        }
        this.LLIZ = textView2;
        if (view != null) {
            c1295960jpS = (C1295960jpS) view.findViewById(R.id.rgx);
        } else {
            c1295960jpS = null;
        }
        this.LLIZLLLIL = c1295960jpS;
        if (view != null) {
            c1324720kZq = (C1324720kZq) view.findViewById(R.id.rgw);
        } else {
            c1324720kZq = null;
        }
        this.LLJ = c1324720kZq;
        if (view != null) {
            textView3 = (TextView) view.findViewById(R.id.tv_online_audience_num);
        } else {
            textView3 = null;
        }
        this.LLJI = textView3;
        this.LLJJIJIIJIL = dataChannel;
        long j = 0;
        if (dataChannel != null && (l = (Long) dataChannel.gg0(C751340Tdc.class)) != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        this.LLJJIJIL = jLongValue;
        if (view != null) {
            liveIconView = (LiveIconView) view.findViewById(R.id.rh0);
        } else {
            liveIconView = null;
        }
        this.LLJIJIL = liveIconView;
        TextView textView4 = this.LLIZ;
        if (textView4 != null) {
            textView4.setTextColor(C20736316Cj.LIZJ(R.attr.er6, this.LLILZLL));
        }
        TextView textView5 = this.LLILZLL;
        if (textView5 != null) {
            textView5.setMaxWidth((int) C497740JfY.LIZIZ(48.0f));
        }
        TextView textView6 = this.LLILZLL;
        if (textView6 != null) {
            layoutParams = textView6.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        } else {
            layoutParams2 = null;
        }
        if (layoutParams2 != null) {
            layoutParams2.gravity = 17;
            layoutParams2.setMarginStart((int) C497740JfY.LIZIZ(6.0f));
            layoutParams2.setMarginEnd((int) C497740JfY.LIZIZ(4.0f));
        }
        TextView textView7 = this.LLILZLL;
        if (textView7 != null) {
            textView7.setEllipsize(TextUtils.TruncateAt.END);
        }
        TextView textView8 = this.LLIZ;
        if (textView8 != null) {
            textView8.setMaxWidth((int) C497740JfY.LIZIZ(48.0f));
            textView8.setEllipsize(TextUtils.TruncateAt.END);
            textView8.setSingleLine(true);
            textView8.setIncludeFontPadding(false);
        }
        TextView textView9 = this.LLIZ;
        if (textView9 != null) {
            textView9.setGravity(17);
        }
        TextView textView10 = this.LLIZ;
        if (textView10 != null) {
            layoutParams3 = textView10.getLayoutParams();
        } else {
            layoutParams3 = null;
        }
        if ((layoutParams3 instanceof FrameLayout.LayoutParams) && (layoutParams4 = (FrameLayout.LayoutParams) layoutParams3) != null) {
            layoutParams4.gravity = 17;
            layoutParams4.setMarginStart((int) C497740JfY.LIZIZ(6.0f));
            layoutParams4.setMarginEnd((int) C497740JfY.LIZIZ(4.0f));
        }
        View view2 = this.LLILLJJLI;
        if (view2 != null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
            gradientDrawable.setShape(0);
            int iLIZIZ = C20736316Cj.LIZIZ(R.attr.eyb, C1834150xpV.LJII(view2.getContext()));
            gradientDrawable.setColors(new int[]{C1331180kkG.LIZIZ(iLIZIZ, 0), iLIZIZ});
            gradientDrawable.setCornerRadius((int) C497740JfY.LIZIZ(12.0f));
            view2.setBackground(gradientDrawable);
        }
        View view3 = this.LLILLL;
        if (view3 != null) {
            ViewGroup.LayoutParams layoutParams5 = view3.getLayoutParams();
            if ((layoutParams5 instanceof C19ME) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams5) != null) {
                marginLayoutParams.width = -2;
                View view4 = this.LLILLL;
                if (view4 != null) {
                    C786410Ut5.W5(view4, marginLayoutParams);
                }
            }
        }
        C1548820qPI.LIZLLL("live_boost_use_card", this);
        this.LLJJIJI.LIZ(C784440Upu.LIZ().LJ(C248600xg.class).LJJLJLI(new C516201zk(this, 128)));
        if (dataChannel != null) {
            dataChannel.EQ2(lifecycleOwner, LiveBoostCardFreshChannel.class, new AwS383S0200000_17(view, this, 54));
        }
        this.LLJJIJI.LIZ(C784440Upu.LIZ().LJ(C1086310eNJ.class).LJJLJLI(new AfS153S0200000_17(this, view, 12)));
        this.LLJJIJI.LIZ(C784440Upu.LIZ().LJ(C1086220eNA.class).LJJLJLI(new AfS153S0200000_17(this, view, 13)));
        DataChannel dataChannel2 = this.LLJJIJIIJIL;
        if (dataChannel2 != null) {
            room = (Room) dataChannel2.gg0(RoomChannel.class);
        }
        DataChannel dataChannel3 = this.LLJJIJIIJIL;
        if (dataChannel3 != null && (bool = (Boolean) dataChannel3.gg0(UserIsAnchorChannel.class)) != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        if (room != null) {
            LiveGiftBoostCardRoomStatus liveGiftBoostCardRoomStatus7 = room.mBoostCardRoomStatus;
            if (liveGiftBoostCardRoomStatus7 != null && liveGiftBoostCardRoomStatus7.mIsBoosting) {
                z = true;
            } else {
                z = false;
            }
            if (z && zBooleanValue) {
                C1086250eND c1086250eND = C1086280eNG.LIZIZ;
                LiveGiftBoostCardRoomStatus liveGiftBoostCardRoomStatus8 = room.mBoostCardRoomStatus;
                c1086250eND.LIZIZ = liveGiftBoostCardRoomStatus8.mExpiredTime * ((long) LSPassThroughRecordSizeConfig.DEFAULT);
                c1086250eND.LIZ = liveGiftBoostCardRoomStatus8.mImagePath;
                c1086250eND.LJ = String.valueOf(liveGiftBoostCardRoomStatus8.mCardId);
                C1086250eND c1086250eND2 = C1086280eNG.LIZIZ;
                LiveGiftBoostCardRoomStatus liveGiftBoostCardRoomStatus9 = room.mBoostCardRoomStatus;
                c1086250eND2.LIZJ = liveGiftBoostCardRoomStatus9.mTaskId;
                c1086250eND2.LIZLLL = String.valueOf(liveGiftBoostCardRoomStatus9.mTaskSource);
                this.LLJJIJI.LIZ(C11NZ.LJLJJLL(5L, TimeUnit.MILLISECONDS).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS186S0100000_17(this, 85)));
                return;
            }
            if (room == null || (liveGiftBoostCardRoomStatus = room.mBoostCardRoomStatus) == null || liveGiftBoostCardRoomStatus.mExpiredTime <= 0 || !zBooleanValue) {
                return;
            }
            C1086250eND c1086250eND3 = C1086280eNG.LIZIZ;
            if (room != null && (liveGiftBoostCardRoomStatus6 = room.mBoostCardRoomStatus) != null) {
                j = liveGiftBoostCardRoomStatus6.mExpiredTime;
            }
            c1086250eND3.LIZIZ = j * ((long) LSPassThroughRecordSizeConfig.DEFAULT);
            Object objValueOf2 = "";
            if (room == null || (liveGiftBoostCardRoomStatus5 = room.mBoostCardRoomStatus) == null || (str = liveGiftBoostCardRoomStatus5.mImagePath) == null) {
                str = "";
            }
            c1086250eND3.LIZ = str;
            if (room == null || (liveGiftBoostCardRoomStatus4 = room.mBoostCardRoomStatus) == null) {
                objValueOf = "";
            } else {
                objValueOf = Long.valueOf(liveGiftBoostCardRoomStatus4.mCardId);
            }
            c1086250eND3.LJ = objValueOf.toString();
            C1086250eND c1086250eND4 = C1086280eNG.LIZIZ;
            if (room == null || (liveGiftBoostCardRoomStatus3 = room.mBoostCardRoomStatus) == null || (str2 = liveGiftBoostCardRoomStatus3.mTaskId) == null) {
                str2 = "";
            }
            c1086250eND4.LIZJ = str2;
            if (room != null && (liveGiftBoostCardRoomStatus2 = room.mBoostCardRoomStatus) != null) {
                objValueOf2 = Long.valueOf(liveGiftBoostCardRoomStatus2.mTaskSource);
            }
            c1086250eND4.LIZLLL = objValueOf2.toString();
            C1086280eNG.LIZIZ.LJFF = true;
            C11NJ c11nj = this.LLJJIJI;
            C480460Ism.LIZ().getClass();
            c11nj.LIZ(((LiveBoostCardApi) C480460Ism.LIZLLL(LiveBoostCardApi.class)).queryUserStatus(this.LLJJIJIL, false).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.0eNH
                @Override // X.C09JN
                public final void accept(Object obj) {
                    long j2;
                    LiveGiftBoostCardUserStatusResponse liveGiftBoostCardUserStatusResponse;
                    C1C7U.LIZ("LiveConsumeBoostCardPresenter@7d3a.checkFlareResume$2");
                    BaseResponse baseResponse = (BaseResponse) obj;
                    if (baseResponse != null && (liveGiftBoostCardUserStatusResponse = (LiveGiftBoostCardUserStatusResponse) baseResponse.data) != null) {
                        j2 = liveGiftBoostCardUserStatusResponse.mTotalUsers;
                    } else {
                        j2 = 0;
                    }
                    C1086280eNG.LIZIZ.LJII = j2;
                    C1C7U.LIZIZ("LiveConsumeBoostCardPresenter@7d3a.checkFlareResume$2");
                }
            }, new C09JN() { // from class: X.00My
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("LiveConsumeBoostCardPresenter@7d3a.checkFlareResume$3");
                    C1C7U.LIZIZ("LiveConsumeBoostCardPresenter@7d3a.checkFlareResume$3");
                }
            }));
        }
    }
}
