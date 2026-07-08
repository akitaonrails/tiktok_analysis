package Y;

import X.C0H80;
import X.C0HCO;
import X.C0HDV;
import X.C13LP;
import X.C1619980sG4;
import X.C19ME;
import X.C2097608Jq;
import X.C23250099c;
import X.C418440Gaw;
import X.C423960Gjq;
import X.C447390HgX;
import X.C447410HgZ;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC423980Gjs;
import X.InterfaceC424010Gjv;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.graphics.Path;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import com.ss.android.ugc.aweme.story.note.panel.StoryNotePanelUserFragment;
import com.ss.android.ugc.aweme.story.note.panel.StoryNotePanelUserVM;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public class ACListenerS20S0301000_6 implements View.OnClickListener {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
            case 2:
                onClick$2(this, view);
                break;
            case 3:
                onClick$3(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS20S0301000_6 aCListenerS20S0301000_6, View view) {
        boolean z;
        ViewParent parent;
        String str;
        StoryNotePanelUserVM storyNotePanelUserVMUR = ((StoryNotePanelUserFragment) aCListenerS20S0301000_6.l0).UR();
        int i = aCListenerS20S0301000_6.i3;
        ((ArrayList) storyNotePanelUserVMUR.LLILZ).add("emoji");
        if (((List) storyNotePanelUserVMUR.LLJJIJIIJIL.getValue()) != null && (!r0.isEmpty())) {
            z = true;
        } else {
            z = false;
        }
        ViewGroup viewGroup = null;
        if (z) {
            List list = (List) storyNotePanelUserVMUR.LLJJIJIIJIL.getValue();
            if (list == null || (str = (String) ListProtector.get(list, i)) == null) {
                str = "";
            }
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(storyNotePanelUserVMUR), null, null, new C0HCO(storyNotePanelUserVMUR, false, str, true, null), 3);
        }
        StoryNotePanelUserFragment storyNotePanelUserFragment = (StoryNotePanelUserFragment) aCListenerS20S0301000_6.l0;
        ImageView imageView = (ImageView) aCListenerS20S0301000_6.l1;
        int i2 = aCListenerS20S0301000_6.i3;
        List<String> list2 = (List) aCListenerS20S0301000_6.l2;
        LinearLayout linearLayout = storyNotePanelUserFragment.LLJJI;
        if (linearLayout != null) {
            parent = linearLayout.getParent();
        } else {
            parent = null;
        }
        if (parent instanceof ConstraintLayout) {
            viewGroup = (ViewGroup) parent;
        }
        if (viewGroup != null) {
            ImageView imageView2 = new ImageView(storyNotePanelUserFragment.getContext());
            viewGroup.addView(imageView2);
            C786410Ut5.c6(imageView2, new C19ME(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(25)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(25))));
            imageView2.setImageBitmap(storyNotePanelUserFragment.SR(i2, list2));
            imageView.getLocationOnScreen(new int[2]);
            viewGroup.getLocationOnScreen(new int[2]);
            C786410Ut5.Hd(imageView2, r3[0] - r2[0]);
            C786410Ut5.Nd(imageView2, r3[1] - r2[1]);
            C786410Ut5.LJZI(0, imageView2);
            imageView = imageView2;
        }
        AvatarComponentView avatarComponentView = ((StoryNotePanelUserFragment) aCListenerS20S0301000_6.l0).LLJ;
        if (avatarComponentView != null) {
            AnimatorSet animatorSet = new AnimatorSet();
            ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(imageView, PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, 1.0f, 1.5f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, 1.0f, 1.5f));
            objectAnimatorOfPropertyValuesHolder.setDuration(250L);
            objectAnimatorOfPropertyValuesHolder.setInterpolator(new LinearInterpolator());
            ObjectAnimator objectAnimatorOfPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(imageView, PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, 1.5f, 0.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, 1.5f, 0.0f));
            objectAnimatorOfPropertyValuesHolder2.setDuration(100L);
            objectAnimatorOfPropertyValuesHolder2.setInterpolator(new LinearInterpolator());
            objectAnimatorOfPropertyValuesHolder2.addListener(new ALAdapterS3S0100000_6(imageView, 0));
            animatorSet.playSequentially(objectAnimatorOfPropertyValuesHolder, objectAnimatorOfPropertyValuesHolder2);
            float x = avatarComponentView.getX() + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(64));
            Float fValueOf = Float.valueOf(12.5f);
            float fLIZIZ = x - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(fValueOf));
            float y = (avatarComponentView.getY() + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(64))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(fValueOf));
            float x2 = fLIZIZ - imageView.getX();
            float y2 = y - imageView.getY();
            Path path = new Path();
            path.moveTo(imageView.getX(), imageView.getY());
            path.quadTo(imageView.getX() + (x2 / 2) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), imageView.getY() + y2, fLIZIZ, y);
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) View.X, (Property<ImageView, Float>) View.Y, path);
            objectAnimatorOfFloat.setDuration(350L);
            objectAnimatorOfFloat.setInterpolator(C1619980sG4.LIZLLL());
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(animatorSet, objectAnimatorOfFloat);
            animatorSet2.addListener(new ALAdapterS3S0100000_6(avatarComponentView, 2));
            animatorSet2.start();
        }
    }

    public static final void onClick$1(ACListenerS20S0301000_6 aCListenerS20S0301000_6, View view) {
        Object objLJJJLL;
        Function2 function2 = (Function2) aCListenerS20S0301000_6.l0;
        Float f = (Float) aCListenerS20S0301000_6.l1;
        Float fValueOf = null;
        if (f != null) {
            C0H80 c0h80 = (C0H80) aCListenerS20S0301000_6.l2;
            f.floatValue();
            fValueOf = Float.valueOf(c0h80.LIZIZ / f.floatValue());
        }
        Pair[] pairArr = new Pair[3];
        List<String> urlList = ((C0H80) aCListenerS20S0301000_6.l2).LIZ.getUrlList();
        if (urlList == null || (objLJJJLL = C13LP.LJJJLL(urlList)) == null) {
            objLJJJLL = "";
        }
        pairArr[0] = new Pair("click_frame_url", objLJJJLL);
        pairArr[1] = new Pair("click_frame_rank", String.valueOf(aCListenerS20S0301000_6.i3));
        pairArr[2] = new Pair("button_type", "click_frame_title");
        function2.invoke(fValueOf, C2097608Jq.LJIIIIZZ(pairArr));
    }

    public static final void onClick$2(ACListenerS20S0301000_6 aCListenerS20S0301000_6, View view) {
        C447390HgX c447390HgX = (C447390HgX) aCListenerS20S0301000_6.l0;
        int i = c447390HgX.LLILZ;
        if (i == aCListenerS20S0301000_6.i3) {
            return;
        }
        c447390HgX.notifyItemChanged(i, 1);
        ((C447390HgX) aCListenerS20S0301000_6.l0).notifyItemChanged(aCListenerS20S0301000_6.i3, 2);
        ((C447390HgX) aCListenerS20S0301000_6.l0).LLILZ = ((C447410HgZ) aCListenerS20S0301000_6.l1).getAdapterPosition();
        Function1<? super Effect, Unit> function1 = ((C447390HgX) aCListenerS20S0301000_6.l0).LLILZIL;
        if (function1 == null) {
            function1 = null;
        }
        function1.invoke((Effect) aCListenerS20S0301000_6.l2);
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    public static final void onClick$3(ACListenerS20S0301000_6 aCListenerS20S0301000_6, View view) {
        int iHashCode = ((View) aCListenerS20S0301000_6.l0).hashCode();
        ConcurrentHashMap<Integer, Boolean> concurrentHashMap = C0HDV.LIZJ;
        if (concurrentHashMap.get(Integer.valueOf(iHashCode)) == null || Intrinsics.LJFF(concurrentHashMap.get(Integer.valueOf(iHashCode)), Boolean.FALSE)) {
            concurrentHashMap.put(Integer.valueOf(iHashCode), Boolean.TRUE);
            C786410Ut5.LJLIIL(800L, ((View) aCListenerS20S0301000_6.l0).getHandler(), new ARunnableS1S0001000_6(iHashCode, 5));
            InterfaceC424010Gjv<InterfaceC423980Gjs> interfaceC424010Gjv = ((C423960Gjq) aCListenerS20S0301000_6.l1).LLILLJJLI;
            if (interfaceC424010Gjv != 0) {
                int i = aCListenerS20S0301000_6.i3;
                interfaceC424010Gjv.LIZ(i, ListProtector.get((List) aCListenerS20S0301000_6.l2, i));
            }
        }
    }

    public ACListenerS20S0301000_6(Object obj, Object obj2, int i, Object obj3, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.l1 = obj2;
        this.i3 = i;
        this.l2 = obj3;
    }
}
