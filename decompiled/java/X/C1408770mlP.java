package X;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.DialogFragment;
import com.bytedance.tux.sheet.BaseSheet;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS423S0200000_22;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0mlP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1408770mlP extends C09AY implements InterfaceC1631620sYq<BaseSheet, View, Boolean, Unit> {
    public final /* synthetic */ VideoPublishEditModel LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1408770mlP(VideoPublishEditModel videoPublishEditModel, Context context, boolean z, Function0 function0, int i, int i2) {
        super(3);
        this.LL = videoPublishEditModel;
        this.LLILLJJLI = context;
        this.LLILLL = z;
        this.LLILZ = function0;
        this.LLILZIL = i;
        this.LLILZLL = i2;
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(BaseSheet baseSheet, View view, Boolean bool) {
        C19EG c19eg;
        Dialog dialog;
        BaseSheet baseSheet2 = baseSheet;
        View view2 = view;
        boolean zBooleanValue = bool.booleanValue();
        if (C0CHQ.LIZ().getPublishService().LJJLIIIJJIZ(this.LL, true)) {
            if (zBooleanValue) {
                if (view2 != null) {
                    String str = TuxSheet._pnsPageId;
                    DialogFragment dialogFragment = (DialogFragment) view2.getTag(R.id.fds);
                    if (dialogFragment != null && (dialog = dialogFragment.getDialog()) != null) {
                        dialog.hide();
                    }
                }
                C1418900n1k c1418900n1k = C1418900n1k.LIZ;
                Context context = this.LLILLJJLI;
                boolean z = this.LLILLL;
                C1408780mlQ c1408780mlQ = new C1408780mlQ(!z, z);
                AwS423S0200000_22 awS423S0200000_22 = new AwS423S0200000_22(this.LL, (VideoPublishEditModel) this.LLILZ, (Function0<Unit>) 71);
                AwS423S0200000_22 awS423S0200000_222 = new AwS423S0200000_22(this.LL, (VideoPublishEditModel) this.LLILZ, (Function0<Unit>) 72);
                C1407790mjp c1407790mjp = new C1407790mjp(this.LL, this.LLILLJJLI, "save", this.LLILZ, this.LLILZIL, this.LLILZLL);
                AwS584S0100000_5 awS584S0100000_5 = new AwS584S0100000_5(baseSheet2, 205);
                c1418900n1k.getClass();
                TuxSheet tuxSheetLJFF = C1418900n1k.LJFF(context, c1408780mlQ, awS423S0200000_22, awS423S0200000_222, c1407790mjp, awS584S0100000_5);
                Context context2 = this.LLILLJJLI;
                if ((context2 instanceof C19EG) && (c19eg = (C19EG) context2) != null) {
                    tuxSheetLJFF.show(c19eg.getSupportFragmentManager(), "guide posting before save");
                }
            } else {
                this.LLILZ.invoke();
            }
        }
        C1418900n1k c1418900n1k2 = C1418900n1k.LIZ;
        VideoPublishEditModel videoPublishEditModel = this.LL;
        int i = this.LLILZIL;
        int i2 = this.LLILZLL;
        c1418900n1k2.getClass();
        C1418900n1k.LIZIZ(i, i2, videoPublishEditModel, "save", "edit_page_save");
        return Unit.LIZ;
    }
}
