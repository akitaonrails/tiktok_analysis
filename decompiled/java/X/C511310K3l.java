package X;

import Y.ACListenerS111S0200000_7;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.livesdk.chatroom.api.SpaceTopicCategory;
import com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.newpost.vm.SubSpaceNewPostVM;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0K3l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C511310K3l extends C0K3V {
    public final View LL;
    public final SubSpaceNewPostVM LLILLJJLI;
    public final LinearLayout LLILLL;

    public C511310K3l(View view, SubSpaceNewPostVM subSpaceNewPostVM) {
        super(view);
        this.LL = view;
        this.LLILLJJLI = subSpaceNewPostVM;
        this.LLILLL = (LinearLayout) view.findViewById(R.id.die);
    }

    @Override // X.C0K3V
    public final void I5(AbstractC511160K2w abstractC511160K2w, InterfaceC2753014t interfaceC2753014t) {
        C511300K3k c511300K3k;
        C0K4F c0k4f;
        SpaceTopicCategory spaceTopicCategory;
        SpaceTopicCategory spaceTopicCategory2;
        if ((abstractC511160K2w instanceof C511300K3k) && (c511300K3k = (C511300K3k) abstractC511160K2w) != null) {
            LinearLayout linearLayout = this.LLILLL;
            if ((interfaceC2753014t instanceof C0K4F) && (c0k4f = (C0K4F) interfaceC2753014t) != null) {
                if (linearLayout.getChildCount() == 0) {
                    LayoutInflater layoutInflaterNe = C786410Ut5.ne(this.LL.getContext());
                    int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                    if (layoutInflaterNe != null) {
                        View view = new View(this.LL.getContext());
                        C786410Ut5.W5(view, new LinearLayout.LayoutParams(iLIZIZ, 1));
                        linearLayout.addView(view);
                    }
                    for (SpaceTopicCategory spaceTopicCategory3 : c511300K3k.LIZ) {
                        View viewTd = C786410Ut5.Td(layoutInflaterNe, R.layout.fic, linearLayout, false);
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
                            C786410Ut5.I7(new ACListenerS111S0200000_7(this, spaceTopicCategory, 80), view3);
                            TextView textView = (TextView) view3.findViewById(R.id.rj5);
                            ImageView imageView = (ImageView) view3.findViewById(R.id.jgm);
                            C0K4A c0k4a = c0k4f.LL;
                            if (c0k4a != null && (spaceTopicCategory2 = c0k4a.LIZIZ) != null && spaceTopicCategory.topicCategoryId == spaceTopicCategory2.topicCategoryId) {
                                view3.setBackgroundResource(R.drawable.dcr);
                                C447370HgV.LIZ(imageView, R.attr.f_9);
                                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.f_9, this.LL.getContext());
                                if (numLIZJ != null) {
                                    textView.setTextColor(numLIZJ.intValue());
                                }
                            } else {
                                view3.setBackgroundResource(R.drawable.dcq);
                                C447370HgV.LIZ(imageView, R.attr.f_f);
                                Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.f_f, this.LL.getContext());
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
