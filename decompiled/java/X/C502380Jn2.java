package X;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.chatroom.api.SpaceTopicCategory;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.newpost.vm.SubSpaceNewPostVM;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0Jn2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C502380Jn2 extends C502700JnY {
    public final View LL;
    public final SubSpaceNewPostVM LLILLJJLI;
    public final LinearLayout LLILLL;

    public C502380Jn2(View view, SubSpaceNewPostVM subSpaceNewPostVM) {
        super(view);
        this.LL = view;
        this.LLILLJJLI = subSpaceNewPostVM;
        this.LLILLL = (LinearLayout) view.findViewById(R.id.die);
    }

    @Override // X.C502700JnY
    public final void I5(AbstractC503810JpL abstractC503810JpL, InterfaceC2753014t interfaceC2753014t) {
        C502440Jn8 c502440Jn8;
        C501810Jm7 c501810Jm7;
        final SpaceTopicCategory spaceTopicCategory;
        SpaceTopicCategory spaceTopicCategory2;
        if ((abstractC503810JpL instanceof C502440Jn8) && (c502440Jn8 = (C502440Jn8) abstractC503810JpL) != null) {
            LinearLayout linearLayout = this.LLILLL;
            if ((interfaceC2753014t instanceof C501810Jm7) && (c501810Jm7 = (C501810Jm7) interfaceC2753014t) != null) {
                if (linearLayout.getChildCount() == 0) {
                    LayoutInflater layoutInflaterNe = C786410Ut5.ne(this.LL.getContext());
                    int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                    if (layoutInflaterNe != null) {
                        View view = new View(this.LL.getContext());
                        C786410Ut5.W5(view, new LinearLayout.LayoutParams(iLIZIZ, 1));
                        linearLayout.addView(view);
                    }
                    for (SpaceTopicCategory spaceTopicCategory3 : c502440Jn8.LIZ) {
                        View viewTd = C786410Ut5.Td(layoutInflaterNe, R.layout.hpk, linearLayout, false);
                        viewTd.setTag(spaceTopicCategory3);
                        linearLayout.addView(viewTd);
                    }
                    int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                    if (layoutInflaterNe != null) {
                        View view2 = new View(this.LL.getContext());
                        C786410Ut5.W5(view2, new LinearLayout.LayoutParams(iLIZIZ2, 1));
                        linearLayout.addView(view2);
                    }
                }
                Iterator<View> it2 = new C09RD(linearLayout).iterator();
                while (true) {
                    C09RE c09re = (C09RE) it2;
                    if (c09re.hasNext()) {
                        View view3 = (View) c09re.next();
                        Object tag = view3.getTag();
                        if ((tag instanceof SpaceTopicCategory) && (spaceTopicCategory = (SpaceTopicCategory) tag) != null) {
                            C786410Ut5.I7(new View.OnClickListener() { // from class: X.0Jn6
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view4) {
                                    SubSpaceNewPostVM subSpaceNewPostVM = this.LL.LLILLJJLI;
                                    SpaceTopicCategory spaceTopicCategory4 = spaceTopicCategory;
                                    subSpaceNewPostVM.getClass();
                                    subSpaceNewPostVM.withState(new C502200Jmk(spaceTopicCategory4, subSpaceNewPostVM));
                                }
                            }, view3);
                            TextView textView = (TextView) view3.findViewById(R.id.rj5);
                            LiveIconView liveIconView = (LiveIconView) view3.findViewById(R.id.jgm);
                            C501820Jm8 c501820Jm8 = c501810Jm7.LL;
                            if (c501820Jm8 != null && (spaceTopicCategory2 = c501820Jm8.LIZIZ) != null && spaceTopicCategory.topicCategoryId == spaceTopicCategory2.topicCategoryId) {
                                view3.setBackgroundResource(R.drawable.fcu);
                                liveIconView.setIconTintAttr(R.attr.eu5);
                                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.eu5, this.LL.getContext());
                                if (numLIZJ != null) {
                                    textView.setTextColor(numLIZJ.intValue());
                                }
                            } else {
                                view3.setBackgroundResource(R.drawable.fct);
                                liveIconView.setIconTintAttr(R.attr.ewy);
                                Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.ewy, this.LL.getContext());
                                if (numLIZJ2 != null) {
                                    textView.setTextColor(numLIZJ2.intValue());
                                }
                            }
                            textView.setText(spaceTopicCategory.topicCategoryText);
                        }
                    } else {
                        return;
                    }
                }
            }
        }
    }
}
