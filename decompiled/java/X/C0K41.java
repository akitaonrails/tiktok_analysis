package X;

import Y.ACListenerS74S0300000_7;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.bytedance.android.livesdk.chatroom.api.SpaceTopicContent;
import com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.newpost.vm.SubSpaceNewPostVM;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0K41, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K41 extends C0K3V {
    public final View LL;
    public final SubSpaceNewPostVM LLILLJJLI;
    public final C1841350y17 LLILLL;
    public final TextView LLILZ;

    public C0K41(View view, SubSpaceNewPostVM subSpaceNewPostVM) {
        super(view);
        this.LL = view;
        this.LLILLJJLI = subSpaceNewPostVM;
        this.LLILLL = (C1841350y17) view.findViewById(R.id.dq6);
        this.LLILZ = (TextView) view.findViewById(R.id.yf7);
    }

    @Override // X.C0K3V
    public final void I5(AbstractC511160K2w abstractC511160K2w, InterfaceC2753014t interfaceC2753014t) {
        C0K4I c0k4i;
        final C0K4F c0k4f;
        SpaceTopicContent spaceTopicContent;
        if ((abstractC511160K2w instanceof C0K4I) && (c0k4i = (C0K4I) abstractC511160K2w) != null && (interfaceC2753014t instanceof C0K4F) && (c0k4f = (C0K4F) interfaceC2753014t) != null) {
            final SpaceTopicContent spaceTopicContent2 = c0k4i.LIZ;
            this.LLILZ.setText(spaceTopicContent2.topicContentText);
            C786410Ut5.I7(new ACListenerS74S0300000_7(this, spaceTopicContent2, c0k4f, 25), this.LL);
            C786410Ut5.B7(this.LLILLL, null);
            C0K4A c0k4a = c0k4f.LL;
            if (c0k4a != null && (spaceTopicContent = c0k4a.LIZLLL) != null && spaceTopicContent2.topicContentId == spaceTopicContent.topicContentId) {
                this.LL.setBackgroundResource(R.drawable.dct);
                this.LLILLL.setChecked(true);
            } else {
                this.LL.setBackgroundResource(R.drawable.dcs);
                this.LLILLL.setChecked(false);
            }
            C786410Ut5.B7(this.LLILLL, new CompoundButton.OnCheckedChangeListener() { // from class: X.0K43
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    if (z) {
                        this.LL.LLILLJJLI.JQ2(spaceTopicContent2);
                        C0K26 c0k26 = C0K26.LIZ;
                        C0K4F c0k4f2 = c0k4f;
                        String str = c0k4f2.LL.LIZIZ.topicCategoryText;
                        String str2 = c0k4f2.LLILLJJLI;
                        c0k26.getClass();
                        C0K26.LIZJ("choose_topic", str, str2);
                        return;
                    }
                    this.LL.LLILLJJLI.JQ2(new SpaceTopicContent());
                }
            });
        }
    }
}
