package X;

import android.view.View;
import android.widget.TextView;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorServiceV2;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.PlaybookUtilKt;
import com.bytedance.android.livesdk.livesetting.linkmic.PlaybookAutoRunTypeSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import webcast.data.multi_guest_play.Playbook;
import wh6.AbS516S0200000_31;

/* JADX INFO: renamed from: X.14lp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20361514lp extends AbstractC960470b6L<C1777560wME> {
    public final DataChannel LL;
    public boolean LLILLJJLI;

    public C20361514lp(View view, DataChannel dataChannel) {
        super(view);
        this.LL = dataChannel;
    }

    @Override // X.AbstractC960470b6L
    public final void I5(int i, Object obj) {
        long j;
        PlaybookAnchorServiceV2 playbookAnchorServiceV2LIZIZ;
        Playbook playbookLJIILJJIL;
        C1777560wME c1777560wME = (C1777560wME) obj;
        TextView textView = (TextView) this.itemView.findViewById(R.id.qsz);
        TextView textView2 = (TextView) this.itemView.findViewById(R.id.qpz);
        int i2 = C1779030wOb.LIZ[c1777560wME.LIZ.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3 && i2 != 4) {
                    throw new C1954807lC();
                }
                textView.setText(C497740JfY.LJIJI(2131854653));
                this.LLILLJJLI = false;
            } else {
                textView.setText(C497740JfY.LJIJI(2131854652));
                this.LLILLJJLI = false;
            }
        } else {
            textView.setText(C497740JfY.LJIJI(2131854651));
            if (!this.LLILLJJLI) {
                C915190ZvJ c915190ZvJ = C978360bZC.LIZJ;
                DataChannel dataChannel = this.LL;
                if (dataChannel != null && (playbookAnchorServiceV2LIZIZ = C784920Uqg.LIZIZ(dataChannel)) != null && (playbookLJIILJJIL = playbookAnchorServiceV2LIZIZ.LJIILJJIL()) != null) {
                    j = playbookLJIILJJIL.playbookId;
                } else {
                    j = 0;
                }
                C978360bZC.LJJII(j, "show", "apply");
                this.LLILLJJLI = true;
            }
        }
        C786410Ut5.I7(new AbS516S0200000_31(c1777560wME, this, 4), textView);
        if (c1777560wME.LIZIZ) {
            this.itemView.setBackgroundResource(R.drawable.f3h);
        } else {
            this.itemView.setBackgroundResource(R.drawable.f3g);
        }
        String str = c1777560wME.LIZJ;
        if (str != null && str.length() != 0 && PlaybookAutoRunTypeSetting.INSTANCE.enable()) {
            if (textView2 != null) {
                textView2.setText(c1777560wME.LIZJ);
                C12ES.LJIILL(0, textView2);
            }
        } else if (textView2 != null) {
            C439101nJ.LJI(textView2);
        }
        C500260Jjc.LJLJLJ(textView, PlaybookUtilKt.LJJ(this.LL));
        if (C500260Jjc.LJJJJIZL(textView)) {
            if (textView2 != null) {
                C500260Jjc.LJLJL(C439101nJ.LIZ(16), textView2);
            }
        } else {
            if (textView2 == null) {
                return;
            }
            C500260Jjc.LJLJL(0, textView2);
        }
    }
}
