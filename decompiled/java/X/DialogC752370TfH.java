package X;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0TfH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class DialogC752370TfH extends C19GN implements InterfaceC750020TbU {
    public final long LLLLILI;
    public final long LLLLJ;
    public final long LLLLJI;
    public final Context LLLLL;
    public final InterfaceC752380TfI LLLLLIL;
    public final boolean LLLLLILLIL;
    public final DataChannel LLLLLJIL;
    public final String LLLLLJLJLL;

    @Override // X.InterfaceC750020TbU
    public final void E5() {
    }

    @Override // X.InterfaceC750020TbU
    public final void LLLLLLJ(C752140Teu c752140Teu, Exception exc) {
    }

    public final Map<String, String> LJL() {
        HashMap map = new HashMap();
        map.put("anchor_id", String.valueOf(this.LLLLJ));
        map.put("room_id", String.valueOf(this.LLLLILI));
        map.put("user_id", String.valueOf(this.LLLLJI));
        map.put("admin_type", C0KYR.LIZJ(this.LLLLLJIL));
        return map;
    }

    @Override // X.InterfaceC750020TbU
    public final void LJJJLZIJ(boolean z) {
        InterfaceC752380TfI interfaceC752380TfI = this.LLLLLIL;
        if (interfaceC752380TfI != null) {
            interfaceC752380TfI.LJJJLZIJ(z);
        }
        if (isShowing()) {
            dismiss();
            C785410UrT.LIZ(this);
            C784440Upu.LIZ().LIZIZ(new C752390TfJ());
        }
    }

    @Override // X.C19GN, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        Context context = getContext();
        if (this.LLLLLILLIL) {
            i = 2131852276;
        } else {
            i = 2131853004;
        }
        this.LLJJ = context.getString(i);
        String string = getContext().getString(2131856767);
        DialogInterfaceOnClickListenerC786020UsS dialogInterfaceOnClickListenerC786020UsS = new DialogInterfaceOnClickListenerC786020UsS(this, 14);
        this.LLJLL = string;
        this.LLLF = dialogInterfaceOnClickListenerC786020UsS;
        String string2 = getContext().getString(2131856766);
        DialogInterfaceOnClickListenerC786020UsS dialogInterfaceOnClickListenerC786020UsS2 = new DialogInterfaceOnClickListenerC786020UsS(this, 15);
        this.LLJLLIL = string2;
        this.LLLFF = dialogInterfaceOnClickListenerC786020UsS2;
    }

    @Override // X.InterfaceC750020TbU
    public final void e0(boolean z, Exception exc) {
        C501540Jlg.LIZJ(getContext(), exc);
        InterfaceC752380TfI interfaceC752380TfI = this.LLLLLIL;
        if (interfaceC752380TfI != null) {
            interfaceC752380TfI.onFailed();
        }
        if (isShowing()) {
            dismiss();
            C785410UrT.LIZ(this);
            C784440Upu.LIZ().LIZIZ(new C752390TfJ());
        }
    }

    public DialogC752370TfH(Context context, long j, long j2, long j3, boolean z, InterfaceC752380TfI interfaceC752380TfI, String str, DataChannel dataChannel) {
        super(context);
        this.LLLLL = context;
        this.LLLLILI = j;
        this.LLLLJ = j2;
        this.LLLLJI = j3;
        this.LLLLLILLIL = z;
        this.LLLLLJIL = dataChannel;
        this.LLLLLIL = interfaceC752380TfI;
        this.LLLLLJLJLL = str;
        this.LLLIIIIL = 17;
    }
}
