package X;

import android.view.View;
import android.widget.CompoundButton;
import com.bytedance.android.livesdk.chatroom.api.SpaceTopicContent;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.newpost.vm.SubSpaceNewPostVM;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Jn0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C502360Jn0 extends C502700JnY {
    public final View LL;
    public final SubSpaceNewPostVM LLILLJJLI;
    public final C20744016Fi LLILLL;
    public final C16F5 LLILZ;

    public C502360Jn0(View view, SubSpaceNewPostVM subSpaceNewPostVM) {
        super(view);
        this.LL = view;
        this.LLILLJJLI = subSpaceNewPostVM;
        this.LLILLL = (C20744016Fi) view.findViewById(R.id.dq6);
        this.LLILZ = (C16F5) view.findViewById(R.id.yf7);
    }

    @Override // X.C502700JnY
    public final void I5(AbstractC503810JpL abstractC503810JpL, InterfaceC2753014t interfaceC2753014t) {
        C502470JnB c502470JnB;
        final C501810Jm7 c501810Jm7;
        SpaceTopicContent spaceTopicContent;
        C786760Ute c786760Ute = null;
        if ((abstractC503810JpL instanceof C502470JnB) && (c502470JnB = (C502470JnB) abstractC503810JpL) != null && (interfaceC2753014t instanceof C501810Jm7) && (c501810Jm7 = (C501810Jm7) interfaceC2753014t) != null) {
            final SpaceTopicContent spaceTopicContent2 = c502470JnB.LIZ;
            this.LLILZ.setText(spaceTopicContent2.topicContentText);
            C786410Ut5.I7(new View.OnClickListener() { // from class: X.0Jmz
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SubSpaceNewPostVM subSpaceNewPostVM = this.LL.LLILLJJLI;
                    SpaceTopicContent spaceTopicContent3 = spaceTopicContent2;
                    subSpaceNewPostVM.getClass();
                    subSpaceNewPostVM.withState(new C502180Jmi(subSpaceNewPostVM, spaceTopicContent3));
                    C501810Jm7 c501810Jm72 = c501810Jm7;
                    C502520JnG.LIZJ("choose_topic", c501810Jm72.LL.LIZIZ.topicCategoryText, c501810Jm72.LLILLJJLI);
                }
            }, this.LL);
            C20744016Fi c20744016Fi = this.LLILLL;
            if (C1848410yCV.LIZ) {
                c786760Ute = new C786760Ute(null);
            }
            c20744016Fi.setOnCheckedChangeListener(c786760Ute);
            C501820Jm8 c501820Jm8 = c501810Jm7.LL;
            if (c501820Jm8 != null && (spaceTopicContent = c501820Jm8.LIZLLL) != null && spaceTopicContent2.topicContentId == spaceTopicContent.topicContentId) {
                this.LL.setBackgroundResource(R.drawable.fcw);
                this.LLILLL.setChecked(true);
            } else {
                this.LL.setBackgroundResource(R.drawable.fcv);
                this.LLILLL.setChecked(false);
            }
            C20744016Fi c20744016Fi2 = this.LLILLL;
            CompoundButton.OnCheckedChangeListener c786760Ute2 = new CompoundButton.OnCheckedChangeListener() { // from class: X.0Jn1
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    if (z) {
                        SubSpaceNewPostVM subSpaceNewPostVM = this.LL.LLILLJJLI;
                        SpaceTopicContent spaceTopicContent3 = spaceTopicContent2;
                        subSpaceNewPostVM.getClass();
                        subSpaceNewPostVM.withState(new C502180Jmi(subSpaceNewPostVM, spaceTopicContent3));
                        C501810Jm7 c501810Jm72 = c501810Jm7;
                        C502520JnG.LIZJ("choose_topic", c501810Jm72.LL.LIZIZ.topicCategoryText, c501810Jm72.LLILLJJLI);
                        return;
                    }
                    SubSpaceNewPostVM subSpaceNewPostVM2 = this.LL.LLILLJJLI;
                    SpaceTopicContent spaceTopicContent4 = new SpaceTopicContent();
                    subSpaceNewPostVM2.getClass();
                    subSpaceNewPostVM2.withState(new C502180Jmi(subSpaceNewPostVM2, spaceTopicContent4));
                }
            };
            if (C1848410yCV.LIZ) {
                c786760Ute2 = new C786760Ute(c786760Ute2);
            }
            c20744016Fi2.setOnCheckedChangeListener(c786760Ute2);
        }
    }
}
