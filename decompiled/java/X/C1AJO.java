package X;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import com.bytedance.android.livesdk.model.RoomDecoration;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS577S0100000_33;

/* JADX INFO: renamed from: X.1AJO, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AJO extends C1AJN<RoomDecoration> {
    public final DataChannel LLL;
    public RoomDecoration LLLF;
    public String LLLFF;

    @Override // X.C1AJN
    public final void j0() {
    }

    @Override // X.C1AJN
    public final View n0() {
        return C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.gd1, this, false);
    }

    @Override // X.C1AJN
    public final void h0() {
        super.h0();
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0134  */
    @Override // X.C1AJN
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p0(android.view.View r18) {
        /*
            Method dump skipped, instruction units count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1AJO.p0(android.view.View):void");
    }

    @Override // X.C1AJN
    public final void i0(AwS577S0100000_33 awS577S0100000_33, AwS577S0100000_33 awS577S0100000_332) {
        C19GO c19go = new C19GO(getContext());
        c19go.LJI(2131843830);
        c19go.LIZIZ(2131841450);
        c19go.LJ(2131843827, new DialogInterfaceOnClickListenerC2189551Amf(this, awS577S0100000_33, 1), false);
        c19go.LIZJ(2131851524, new DialogInterfaceOnClickListenerC2189611Aml(awS577S0100000_332, 18), false);
        c19go.LJJIIJ = false;
        c19go.LJIIZILJ = new DialogInterface.OnDismissListener() { // from class: X.0epv
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                C473050Igp.LIZIZ().LJ();
            }
        };
        c19go.LJIJ = new DialogInterface.OnShowListener() { // from class: X.0f8e
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                C473050Igp.LIZIZ().LIZ();
            }
        };
        C786410Ut5.M4(c19go.LIZ());
    }

    public static /* synthetic */ void B0(C1AJO c1ajo, Function0 function0, DialogInterface dialogInterface) {
        c1ajo.getClass();
        dialogInterface.dismiss();
        super.h0();
        function0.invoke();
    }

    public C1AJO(Context context, RoomDecoration roomDecoration, boolean z, int[] iArr, InterfaceC2177361AJi interfaceC2177361AJi, boolean z2, DataChannel dataChannel) {
        super(context, roomDecoration, z, iArr, interfaceC2177361AJi, z2);
        this.LLLFF = "";
        this.LLL = dataChannel;
    }
}
