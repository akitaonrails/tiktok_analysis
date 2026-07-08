package X;

import android.content.Context;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import kotlin.jvm.internal.AwS430S0200000_29;

/* JADX INFO: renamed from: X.11jL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19581711jL implements InterfaceC1212180heK {
    public final C01GW LIZ;

    @Override // X.InterfaceC1212180heK
    public final C19615711op getView() {
        return (C19615711op) this.LIZ.getValue();
    }

    public C19581711jL(Context context, InteractStickerStruct interactStickerStruct) {
        this.LIZ = C452501pT.LIZIZ(new AwS430S0200000_29(context, interactStickerStruct, 121));
    }
}
