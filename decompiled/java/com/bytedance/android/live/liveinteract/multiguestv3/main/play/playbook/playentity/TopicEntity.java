package com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.playentity;

import X.AbstractC20356314kz;
import X.C13LP;
import X.C19322110iZ;
import X.C20357914lF;
import X.C20361214lm;
import X.C20361314ln;
import X.C20424814w2;
import X.C418440Gaw;
import X.C473410IhP;
import X.C497740JfY;
import X.C500260Jjc;
import X.C748880TZe;
import X.C786410Ut5;
import X.C814420VxA;
import X.C937280aUw;
import X.InterfaceC979390bar;
import Y.ARunnableS131S0100000_31;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.editor.pgc.TopicEditDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.editor.settings.PlaybookAutoRotationTimeConfig;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AwS397S0200000_31;
import kotlin.jvm.internal.AwS645S0100000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class TopicEntity extends AbstractC20356314kz {
    public final C20357914lF LLJJJJJIL = new C20357914lF("topic", 0, 40100006, 1, Collections.singletonList("always_true"), null, 26616);
    public ARunnableS131S0100000_31 LLJJJJLIIL;

    @Override // X.AbstractC20356314kz
    public final void LJJIL() {
        ARunnableS131S0100000_31 aRunnableS131S0100000_31 = this.LLJJJJLIIL;
        if (aRunnableS131S0100000_31 != null) {
            C473410IhP.LIZ().removeCallbacks(aRunnableS131S0100000_31);
            this.LLJJJJLIIL = null;
        }
    }

    @Override // X.AbstractC20356314kz
    public final void LJJJJZI() {
        LJJIL();
        super.LJJJJZI();
    }

    @Override // X.AbstractC20356314kz, com.bytedance.android.livesdk.entity.PlayRule
    public final void destroy() {
        LJJIL();
        super.destroy();
    }

    @Override // X.AbstractC20356314kz
    public final C20357914lF LJJJIL() {
        return this.LLJJJJJIL;
    }

    @Override // X.AbstractC20356314kz
    public final void LJJLI(C20361214lm c20361214lm) {
        ARunnableS131S0100000_31 aRunnableS131S0100000_31 = new ARunnableS131S0100000_31(this, 22);
        this.LLJJJJLIIL = aRunnableS131S0100000_31;
        C786410Ut5.LJLIIL(((long) PlaybookAutoRotationTimeConfig.INSTANCE.getTimeInSecond()) * 1000, C473410IhP.LIZ(), aRunnableS131S0100000_31);
    }

    public static void LJJLIIIJ(ViewGroup viewGroup, TopicContent topicContent) {
        if (viewGroup != null) {
            ((TextView) viewGroup.findViewById(R.id.yf7)).setText(topicContent.title);
            List<String> list = topicContent.content;
            String str = (String) C13LP.LJJJLZIJ(0, list);
            if (str != null) {
                TextView textView = (TextView) viewGroup.findViewById(R.id.yel);
                if (list.size() > 1) {
                    textView.setText(C500260Jjc.LIZJ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), C497740JfY.LIZLLL(R.attr.ezq, textView.getContext()), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), str));
                    textView.setPaddingRelative((int) C497740JfY.LIZIZ(4.0f), 0, 0, 0);
                } else {
                    textView.setText(str);
                    textView.setPaddingRelative(0, 0, 0, 0);
                }
                C500260Jjc.LLFFF(textView);
            }
            String str2 = (String) C13LP.LJJJLZIJ(1, list);
            if (str2 != null) {
                TextView textView2 = (TextView) viewGroup.findViewById(R.id.yen);
                textView2.setText(C500260Jjc.LIZJ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), C497740JfY.LIZLLL(R.attr.ezq, textView2.getContext()), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), str2));
                textView2.setPaddingRelative((int) C497740JfY.LIZIZ(4.0f), 0, 0, 0);
                C500260Jjc.LLFFF(textView2);
            }
            String str3 = (String) C13LP.LJJJLZIJ(2, list);
            if (str3 != null) {
                TextView textView3 = (TextView) viewGroup.findViewById(R.id.yeo);
                textView3.setText(C500260Jjc.LIZJ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), C497740JfY.LIZLLL(R.attr.ezq, textView3.getContext()), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), str3));
                textView3.setPaddingRelative((int) C497740JfY.LIZIZ(4.0f), 0, 0, 0);
                C500260Jjc.LLFFF(textView3);
            }
        }
    }

    @Override // X.AbstractC20356314kz
    public final C20361314ln LJJJLIIL(C20424814w2 c20424814w2, int i) {
        return new C20361314ln("TopicEntity", "TopicEntity", R.attr.da8, R.attr.da8, null, null, 0, null, false, new AwS645S0100000_31(this, 90), 3312);
    }

    @Override // X.AbstractC20356314kz, com.bytedance.android.livesdk.entity.PlayRule
    public final void LJJIIZ(C20361214lm c20361214lm, InterfaceC979390bar interfaceC979390bar, LifecycleOwner lifecycleOwner) {
        FragmentManager fragmentManager;
        TopicConfig topicConfig = (TopicConfig) C937280aUw.LIZJ(TopicConfig.class, c20361214lm.LJI, new TopicConfig());
        DataChannel dataChannel = this.LLJ;
        if (dataChannel != null && (fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class)) != null && C19322110iZ.LJFF(fragmentManager, new TopicEditDialog(topicConfig.contentList, new AwS397S0200000_31(interfaceC979390bar, this, 19)), this.LLJJJJJIL.LIZ, null, 0) <= 0) {
            interfaceC979390bar.LIZLLL(this.LLJJJJJIL.LIZLLL, "open sheet fail");
        }
    }
}
