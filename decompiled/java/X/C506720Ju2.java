package X;

import android.text.Editable;
import android.view.View;
import com.bytedance.android.live.design.widget.SimpleLiveTextView;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.detail.view.assem.FakeSubSpaceEditorAssem;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Ju2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C506720Ju2 extends C09AY implements Function2<UIAssem, C291001Au<? extends Editable>, Unit> {
    public final /* synthetic */ FakeSubSpaceEditorAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C506720Ju2(FakeSubSpaceEditorAssem fakeSubSpaceEditorAssem) {
        super(2);
        this.LL = fakeSubSpaceEditorAssem;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(UIAssem uIAssem, C291001Au<? extends Editable> c291001Au) {
        CharSequence charSequence;
        C291001Au<? extends Editable> c291001Au2 = c291001Au;
        if (c291001Au2 != null) {
            charSequence = (CharSequence) c291001Au2.LIZ;
        } else {
            charSequence = null;
        }
        FakeSubSpaceEditorAssem fakeSubSpaceEditorAssem = this.LL;
        try {
            C1110070ezd c1110070ezd = (C1110070ezd) fakeSubSpaceEditorAssem.LLJJIJI.getValue();
            if (charSequence == null) {
                charSequence = "";
            }
            c1110070ezd.setText(charSequence);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        CharSequence text = ((SimpleLiveTextView) fakeSubSpaceEditorAssem.LLJJIJI.getValue()).getText();
        if (text != null && text.length() > 0) {
            C786410Ut5.LJLLLLLL(0, (View) fakeSubSpaceEditorAssem.LLJJJ.getValue());
        } else {
            C786410Ut5.LJLLLLLL(8, (View) fakeSubSpaceEditorAssem.LLJJJ.getValue());
        }
        return Unit.LIZ;
    }
}
