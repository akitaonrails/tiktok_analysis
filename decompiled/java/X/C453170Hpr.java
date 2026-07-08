package X;

import android.view.View;
import com.ss.android.ugc.aweme.im.common.model.StickerItem;

/* JADX INFO: renamed from: X.0Hpr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C453170Hpr extends C09AY implements InterfaceC1631620sYq<StickerItem, View, EnumC453020Hpc, Boolean> {
    public final /* synthetic */ C453330Hq7 LL;
    public final /* synthetic */ int LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C453170Hpr(C453330Hq7 c453330Hq7, int i) {
        super(3);
        this.LL = c453330Hq7;
        this.LLILLJJLI = i;
    }

    @Override // X.InterfaceC1631620sYq
    public final Boolean invoke(StickerItem stickerItem, View view, EnumC453020Hpc enumC453020Hpc) {
        StickerItem stickerItem2 = stickerItem;
        View view2 = view;
        EnumC453020Hpc enumC453020Hpc2 = enumC453020Hpc;
        InterfaceC453160Hpq interfaceC453160Hpq = this.LL.LLILLJJLI;
        if (interfaceC453160Hpq != null) {
            interfaceC453160Hpq.f3(stickerItem2, view2, this.LLILLJJLI, enumC453020Hpc2);
        }
        return Boolean.TRUE;
    }
}
