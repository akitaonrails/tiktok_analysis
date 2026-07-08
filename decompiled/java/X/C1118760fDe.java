package X;

import Y.ALAdapterS2S0400000_17;
import Y.ARunnableS86S0200000_17;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.graphics.drawable.Animatable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.effectmanager.common.utils.MD5Utils;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fDe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1118760fDe extends RelativeLayout {
    public final Map<ImageView, AnimatorSet> LL;
    public int LLILLJJLI;
    public final Queue<C1137690fiB> LLILLL;
    public boolean LLILZ;

    public C1118760fDe(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final void LIZJ() {
        Iterator it2 = ((ConcurrentHashMap) this.LL).entrySet().iterator();
        while (it2.hasNext()) {
            AnimatorSet animatorSet = (AnimatorSet) ((Map.Entry) it2.next()).getValue();
            if (animatorSet != null) {
                animatorSet.end();
            }
        }
        ((ConcurrentHashMap) this.LL).clear();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ((ArrayBlockingQueue) this.LLILLL).clear();
        LIZJ();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    public static ObjectAnimator LIZIZ(ImageView imageView) {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(imageView, PropertyValuesHolder.ofFloat((Property<?, Float>) View.ALPHA, 1.0f, 0.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, 1.0f, 0.8f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, 1.0f, 0.8f));
        objectAnimatorOfPropertyValuesHolder.setDuration(200L);
        return objectAnimatorOfPropertyValuesHolder;
    }

    public static String LJ(C1118830fDl c1118830fDl) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c1118830fDl.LIZJ.LIZJ.getUri());
        sbLIZ.append(c1118830fDl.LIZLLL);
        sbLIZ.append(c1118830fDl.LJ);
        return MD5Utils.getMD5String(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final ImageView LIZLLL(String str) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (Intrinsics.LJFF(childAt.getTag(R.id.ytb), str) && (childAt instanceof ImageView)) {
                return (ImageView) childAt;
            }
        }
        return null;
    }

    public final void LJFF(C1137690fiB c1137690fiB) {
        if (c1137690fiB.LIZ.LIZIZ == 2) {
            ((ArrayBlockingQueue) this.LLILLL).offer(c1137690fiB);
            if (((ConcurrentHashMap) this.LL).size() >= 2) {
                ((AnimatorSet) ListProtector.get(C13LP.LLIIII(((ConcurrentHashMap) this.LL).values()), 0)).end();
            }
            LJIIIIZZ("firAnimationImmediately");
            return;
        }
        ((ArrayBlockingQueue) this.LLILLL).offer(c1137690fiB);
        LJIIIIZZ("onGiftEvent");
    }

    public final void LJIIIIZZ(String str) {
        C1137690fiB c1137690fiB;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tryFireAnimation , ");
        sbLIZ.append(str);
        C20441214yg.LIZIZ("AnimationView", C2188811AlT.LIZIZ(sbLIZ));
        C1137690fiB c1137690fiB2 = (C1137690fiB) ((ArrayBlockingQueue) this.LLILLL).peek();
        if (c1137690fiB2 != null) {
            String strLJ = LJ(c1137690fiB2.LIZ);
            if (!this.LLILZ) {
                if ((getChildCount() >= 2 && (getChildCount() != 2 || !c1137690fiB2.LIZ.LJFF || LIZLLL(strLJ) == null)) || (c1137690fiB = (C1137690fiB) ((ArrayBlockingQueue) this.LLILLL).poll()) == null) {
                    return;
                }
                HandlerHook.viewPostDelay(this, new ARunnableS86S0200000_17(this, c1137690fiB, 9), 16L);
            }
        }
    }

    public final void LIZ(int i, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        if (i != 0) {
            this.LLILLJJLI = i;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if ((layoutParams instanceof C19ME) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            marginLayoutParams2.setMarginEnd(i2);
        }
        ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
        if ((layoutParams2 instanceof C19ME) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
            marginLayoutParams.rightMargin = i2;
        }
        this.LLILZ = false;
        LJIIIIZZ("onLayoutSwitch");
    }

    public final void LJI(final String str, final C1137690fiB c1137690fiB) {
        final ImageView imageView = new ImageView(getContext());
        int i = this.LLILLJJLI;
        C786410Ut5.c6(imageView, new FrameLayout.LayoutParams(i, i));
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setTag(R.id.ytb, str);
        addView(imageView);
        C1322000kVS c1322000kVSLJFF = C1322000kVS.LJFF(getContext());
        c1322000kVSLJFF.LJFF = c1137690fiB.LIZ.LIZJ.LIZJ;
        c1322000kVSLJFF.LIZLLL = new C1320700kTM<Object>(str, imageView, c1137690fiB) { // from class: X.0fDd
            public final /* synthetic */ ImageView LIZJ;
            public final /* synthetic */ C1137690fiB LIZLLL;

            @Override // X.C1320700kTM, X.InterfaceC1320650kTH
            public final void LIZLLL(String str2, Throwable th) {
                String message;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("playCompleteAnimationAfterAddGiftChild load image failed:");
                if (th != null) {
                    message = th.getMessage();
                } else {
                    message = null;
                }
                sbLIZ.append(message);
                C20441214yg.LJ("GiftExpressionToLinkerAnimationView", C2188811AlT.LIZIZ(sbLIZ));
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // X.C1320700kTM, X.InterfaceC1320650kTH
            public final void LJ(String str2, Object obj, Animatable animatable) {
                C1118760fDe c1118760fDe = this.LIZIZ;
                ImageView imageView2 = this.LIZJ;
                C1137690fiB c1137690fiB2 = this.LIZLLL;
                c1118760fDe.getClass();
                AnimatorSet animatorSet = new AnimatorSet();
                if (imageView2 != null) {
                    ((ConcurrentHashMap) c1118760fDe.LL).put(imageView2, animatorSet);
                }
                ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(imageView2, PropertyValuesHolder.ofFloat((Property<?, Float>) View.ALPHA, 0.0f, 1.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, 0.3f, 1.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, 0.3f, 1.0f));
                objectAnimatorOfPropertyValuesHolder.setDuration(200L);
                objectAnimatorOfPropertyValuesHolder.setInterpolator(new OvershootInterpolator());
                ObjectAnimator objectAnimatorLIZIZ = C1118760fDe.LIZIZ(imageView2);
                ArrayList arrayList = new ArrayList();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("playCompleteAnimation-");
                sbLIZ.append(imageView2);
                sbLIZ.append(" , ");
                sbLIZ.append(c1118760fDe);
                sbLIZ.append(" - ");
                sbLIZ.append(c1118760fDe.getChildCount());
                C20441214yg.LIZIZ("AnimationView", C2188811AlT.LIZIZ(sbLIZ));
                int childCount = c1118760fDe.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = c1118760fDe.getChildAt(i2);
                    if (!Intrinsics.LJFF(childAt, imageView2)) {
                        C786410Ut5.Jc(childAt, 0.0f);
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("transition-view=");
                        sbLIZ2.append(childAt);
                        sbLIZ2.append(",giftview=");
                        sbLIZ2.append(imageView2);
                        sbLIZ2.append(" - ");
                        float f = i2 + 1;
                        sbLIZ2.append((childAt.getWidth() + 0.0f) * f);
                        sbLIZ2.append('}');
                        C20441214yg.LIZIZ("AnimationView", C2188811AlT.LIZIZ(sbLIZ2));
                        if (C497740JfY.LJJ()) {
                            arrayList.add(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.TRANSLATION_X, (c1118760fDe.LLILLJJLI + 0.0f) * f));
                        } else {
                            arrayList.add(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.TRANSLATION_X, (-(c1118760fDe.LLILLJJLI + 0.0f)) * f));
                        }
                    }
                }
                c1118760fDe.LJII(animatorSet, objectAnimatorOfPropertyValuesHolder, objectAnimatorLIZIZ, arrayList, imageView2, c1137690fiB2);
            }

            {
                this.LIZJ = imageView;
                this.LIZLLL = c1137690fiB;
            }
        };
        c1322000kVSLJFF.LIZJ(imageView);
    }

    public C1118760fDe(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        this.LL = new ConcurrentHashMap();
        this.LLILLJJLI = C439101nJ.LIZ(20);
        this.LLILLL = new ArrayBlockingQueue(50);
        setGravity(8388629);
    }

    public final void LJII(AnimatorSet animatorSet, ObjectAnimator objectAnimator, ObjectAnimator objectAnimator2, List list, ImageView imageView, C1137690fiB c1137690fiB) {
        AnimatorSet.Builder builderAfter;
        HashMap map = new HashMap();
        C01Z4.LIZ(null, map);
        User userLJIJJLI = UserService.getInstance().user().LJIJJLI();
        if (C930540aK4.LJIJJ(userLJIJJLI)) {
            map.put("user_type", "anchor");
            map.remove("enter_method");
            map.remove("enter_from_merge");
        } else {
            map.put("user_type", "user");
        }
        if (C930540aK4.LJJII(userLJIJJLI)) {
            map.put("is_guest", "1");
        } else {
            map.put("is_guest", CardStruct.IStatusCode.DEFAULT);
        }
        C0KX4.LIZ("livesdk_video_box_gift_icon_effect_show", map, null, true);
        C013C c013c = new C013C();
        AnimatorSet.Builder builderPlay = animatorSet.play(objectAnimator2);
        if (builderPlay != null && (builderAfter = builderPlay.after(objectAnimator)) != null) {
            builderAfter.after(c1137690fiB.LIZ.LJII - 500);
        }
        animatorSet.addListener(new ALAdapterS2S0400000_17(c013c, animatorSet, imageView, this, 0));
        if (list != null && (!((ArrayList) list).isEmpty())) {
            animatorSet.playTogether(C13LP.LLIIII(list));
        }
        animatorSet.start();
    }
}
