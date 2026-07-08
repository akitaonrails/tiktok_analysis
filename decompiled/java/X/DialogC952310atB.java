package X;

import Y.ACListenerS150S0100000_15;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.tools.MultiCanvasUtils;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiguestNoticeboardV2Setting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: renamed from: X.0atB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class DialogC952310atB extends AbstractDialogC962810bA7 {
    public static DialogC952310atB LLJJIII;
    public final EnumC952890au7 LLJI;
    public final Function1<C953770avX, Unit> LLJIJIL;
    public final DataChannel LLJILJIL;
    public RunnableC781530UlD LLJILJILJ;
    public C1117360fBO LLJILLL;
    public TuxTextView LLJJ;
    public TuxTextView LLJJI;

    @Override // X.AbstractDialogC972150bPB
    public final int LJJZZIII() {
        return R.layout.g_3;
    }

    @Override // X.C19GI, X.DialogC19728412Gs, android.app.Dialog
    public final void show() throws Throwable {
        Object obj;
        C0WZX c0wzx = new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yeeYEJJ97iNZknTVMu//6lsVPlMF/xh3yMjXB9EX+N5cT+mRsEIix6zmUcBwbyL0ej0znPyXhkjA4ffPpsTQ7PoQ4GWjdV0IjVYbsdO8g5fo2TGSvFkr13rFgF9d4v4=", null);
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(300000, "com/bytedance/android/live/liveinteract/multiguestv3/main/theme/noticeboard/common/multicanvas/NoticeBoardBaseDialog", "show", this, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(300000, "com/bytedance/android/live/liveinteract/multiguestv3/main/theme/noticeboard/common/multicanvas/NoticeBoardBaseDialog", "show", null, objArr, this, c0wzw, false);
        } else {
            Object[] objArr2 = c0wsuLIZIZ.LIZJ;
            C19GI c19gi = (objArr2 == null || (obj = objArr2[0]) == null) ? this : (C19GI) obj;
            super.show();
            c0wst.LIZ(300000, "com/bytedance/android/live/liveinteract/multiguestv3/main/theme/noticeboard/common/multicanvas/NoticeBoardBaseDialog", "show", null, objArr, c19gi, c0wzw, true);
        }
        MultiCanvasUtils multiCanvasUtils = MultiCanvasUtils.LIZ;
        EnumC952890au7 enumC952890au7 = this.LLJI;
        multiCanvasUtils.getClass();
        C946850akN.LJFF(MultiCanvasUtils.LJIIJJI(enumC952890au7), EnumC971610bOJ.HISTORY, "in_spots");
    }

    @Override // X.AbstractDialogC962810bA7, X.AbstractDialogC972150bPB, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        ((C0GUM) findViewById(R.id.tsc)).e0(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), 0);
        C786410Ut5.I7(new ACListenerS150S0100000_15(this, 280), findViewById(R.id.bn2));
        ((TextView) findViewById(R.id.title)).setText(2131853997);
        this.LLJILJILJ = (RunnableC781530UlD) findViewById(R.id.t0q);
        C1117360fBO c1117360fBO = new C1117360fBO();
        final AwS594S0100000_15 awS594S0100000_15 = new AwS594S0100000_15(this, 1095);
        final DataChannel dataChannel = this.LLJILJIL;
        c1117360fBO.LLLI(C953770avX.class, new AbstractC960460b6K<C953770avX, C952250at5>(dataChannel, awS594S0100000_15) { // from class: X.0at7
            public final Function1<C953770avX, Unit> LIZIZ;

            {
                this.LIZIZ = awS594S0100000_15;
            }

            @Override // X.C0J8P
            /* JADX INFO: renamed from: LJ */
            public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                return new C952250at5(C786410Ut5.Td(C972080bP4.LIZ(C786410Ut5.ne(viewGroup.getContext())), R.layout.hff, viewGroup, false), this.LIZIZ);
            }
        });
        this.LLJILLL = c1117360fBO;
        RunnableC781530UlD runnableC781530UlD = this.LLJILJILJ;
        if (runnableC781530UlD != null) {
            runnableC781530UlD.setAdapter(c1117360fBO);
            runnableC781530UlD.setLayoutManager(new LinearLayoutManager(getContext()));
        }
        TuxTextView tuxTextView = (TuxTextView) findViewById(R.id.p_a);
        this.LLJJ = tuxTextView;
        if (tuxTextView != null) {
            tuxTextView.setText(2131853988);
        }
        TuxTextView tuxTextView2 = (TuxTextView) findViewById(R.id.p_b);
        this.LLJJI = tuxTextView2;
        if (tuxTextView2 != null) {
            if (MultiguestNoticeboardV2Setting.INSTANCE.isPreviewEnable()) {
                i = 2131853987;
            } else {
                i = 2131853986;
            }
            tuxTextView2.setText(i);
        }
        MultiCanvasUtils multiCanvasUtils = MultiCanvasUtils.LIZ;
        AwS559S0100000_15 awS559S0100000_15 = new AwS559S0100000_15(this, 1093);
        AwS559S0100000_15 awS559S0100000_152 = new AwS559S0100000_15(this, 1094);
        multiCanvasUtils.getClass();
        MultiCanvasUtils.LIZJ(awS559S0100000_15, awS559S0100000_152);
    }

    public DialogC952310atB(Context context, EnumC952890au7 enumC952890au7, AwS594S0100000_15 awS594S0100000_15, DataChannel dataChannel) {
        super(context);
        this.LLJI = enumC952890au7;
        this.LLJIJIL = awS594S0100000_15;
        this.LLJILJIL = dataChannel;
    }
}
