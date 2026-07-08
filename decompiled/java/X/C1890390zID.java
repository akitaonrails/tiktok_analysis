package X;

import Y.ACListenerS130S0200000_28;
import Y.ACListenerS92S0300000_28;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.inbox.shop.MoveFullEntryAssetsItemData;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0zID, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1890390zID extends RecyclerView.ViewHolder implements C0Z37<MoveFullEntryAssetsItemData> {
    public static final /* synthetic */ int LLILLJJLI = 0;
    public Function0<Unit> LL;

    public C1890390zID(View view) {
        super(view);
    }

    @Override // X.C0Z37
    public final void LJZI(int i, InterfaceC1891350zJl interfaceC1891350zJl) {
        String str;
        MoveFullEntryAssetsItemData moveFullEntryAssetsItemData = (MoveFullEntryAssetsItemData) interfaceC1891350zJl;
        InterfaceC1890400zIE interfaceC1890400zIEInboxService = ((IECommerceService) ServiceManager.get().getService(IECommerceService.class)).inboxService();
        ((TextView) this.itemView.findViewById(R.id.v6l)).setText(moveFullEntryAssetsItemData.content);
        ((TextView) this.itemView.findViewById(R.id.v6n)).setText(moveFullEntryAssetsItemData.actionAreaText);
        if (C960203pA.LIZIZ(this.itemView.getContext())) {
            str = moveFullEntryAssetsItemData.lightIconUrl;
        } else {
            str = moveFullEntryAssetsItemData.darkIconUrl;
        }
        if (C123100dR.LIZ(str)) {
            SmartImageView smartImageView = (SmartImageView) this.itemView.findViewById(R.id.v6m);
            C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
            c1331670kl3LJIIIZ.LJJ(smartImageView);
            C786410Ut5.h3(c1331670kl3LJIIIZ);
        }
        C786410Ut5.a9((TuxIconView) this.itemView.findViewById(R.id.v6k), new ACListenerS130S0200000_28(interfaceC1890400zIEInboxService, this, 44));
        if (C123100dR.LIZ(moveFullEntryAssetsItemData.schemaLink)) {
            C786410Ut5.h9((TuxTextView) this.itemView.findViewById(R.id.v6n), new ACListenerS92S0300000_28(this, moveFullEntryAssetsItemData, interfaceC1890400zIEInboxService, 8));
        }
        interfaceC1890400zIEInboxService.LJFF(EnumC1767180w5U.SHOW_MIGRATION_VIEW, null);
    }
}
