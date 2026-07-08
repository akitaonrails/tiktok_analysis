package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0KHz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C515090KHz implements InterfaceC515610KJz {
    public final String LL = "item_package_offer_description";
    public final String LLILLJJLI;

    @Override // X.InterfaceC515600KJy
    public final String LJJJ() {
        return this.LL;
    }

    @Override // X.InterfaceC515610KJz
    public final String getTextContent() {
        return this.LLILLJJLI;
    }

    public C515090KHz(String str) {
        this.LLILLJJLI = str;
    }

    @Override // X.InterfaceC515600KJy
    public final boolean LIZ(InterfaceC515600KJy interfaceC515600KJy) {
        if (interfaceC515600KJy instanceof InterfaceC515610KJz) {
            return Intrinsics.LJFF(this.LLILLJJLI, ((InterfaceC515610KJz) interfaceC515600KJy).getTextContent());
        }
        return false;
    }
}
