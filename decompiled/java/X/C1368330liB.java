package X;

import Y.AObserverS224S0100000_21;
import android.os.Bundle;
import android.view.View;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS422S0200000_21;

/* JADX INFO: renamed from: X.0liB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1368330liB extends AbstractC1368920lj8 {
    public View LLJIJIL;
    public final C01GW LLJILJIL;

    public C1368330liB(C1368870lj3 c1368870lj3) {
        super(c1368870lj3);
        this.LLJILJIL = C452501pT.LIZIZ(new AwS422S0200000_21(this, c1368870lj3, 5));
    }

    @Override // X.AbstractC1368920lj8, X.InterfaceC1368960ljC
    public final void E3(SharePackage sharePackage) {
        InterfaceC790320UzO interfaceC790320UzO = (InterfaceC790320UzO) this.LLJILJIL.getValue();
        if (interfaceC790320UzO != null) {
            interfaceC790320UzO.E3(sharePackage);
        }
    }

    @Override // X.InterfaceC1368960ljC
    public final void onViewCreated(View view, Bundle bundle) {
        InterfaceC790320UzO interfaceC790320UzO;
        this.LLIZ = view;
        if (LJ()) {
            return;
        }
        this.LLJIJIL = view.findViewById(R.id.v1s);
        String string = LIZJ().LIZ.extras.getString("default_edit_text_msg");
        if (string != null && (interfaceC790320UzO = (InterfaceC790320UzO) this.LLJILJIL.getValue()) != null) {
            interfaceC790320UzO.LIZ(string);
        }
        LIZLLL().LLJILLL.observe(LIZIZ(), new AObserverS224S0100000_21(this, 4));
        LIZLLL().LLJJIJI.observe(LIZIZ(), new AObserverS224S0100000_21(this, 5));
    }
}
