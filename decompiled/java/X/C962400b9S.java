package X;

import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.multihost.biz.dialog.LinkDialog;
import com.bytedance.android.livesdk.chatroom.interact.model.QuickCohostContent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0b9S, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C962400b9S extends C09AY implements Function1<View, Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ AbstractC962390b9R<Object> LLILLJJLI;
    public final /* synthetic */ List<QuickCohostContent> LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C962400b9S(boolean z, AbstractC962390b9R<Object> abstractC962390b9R, List<QuickCohostContent> list, boolean z2, String str) {
        super(1);
        this.LL = z;
        this.LLILLJJLI = abstractC962390b9R;
        this.LLILLL = list;
        this.LLILZ = z2;
        this.LLILZIL = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        if (this.LL) {
            AbstractC962390b9R<Object> abstractC962390b9R = this.LLILLJJLI;
            abstractC962390b9R.LLJJL = true;
            abstractC962390b9R.LLJJJJLIIL = false;
        } else {
            AbstractC962390b9R<Object> abstractC962390b9R2 = this.LLILLJJLI;
            abstractC962390b9R2.LLJJL = false;
            abstractC962390b9R2.LLJJJJLIIL = true;
        }
        C961300b7g.LIZ.getClass();
        C961300b7g.LJ();
        DataChannel dataChannel = this.LLILLJJLI.getDataChannel();
        LifecycleOwner lifecycleOwner = this.LLILLJJLI.LLILZ;
        List<QuickCohostContent> list = this.LLILLL;
        boolean z = this.LLILZ;
        String str = this.LLILZIL;
        LinkDialog linkDialog = new LinkDialog(lifecycleOwner);
        EnumC977660bY4 enumC977660bY4 = EnumC977660bY4.MULTI_CO_HOST_RANDOM_LINK_SELECT_INTEREST_TAG_FRAGMENT;
        C962430b9V c962430b9V = new C962430b9V();
        c962430b9V.LIZIZ = list;
        c962430b9V.LIZJ = z;
        c962430b9V.LIZLLL = str;
        linkDialog.LLILZIL = enumC977660bY4;
        linkDialog.LLILZLL = c962430b9V;
        C957750b1x.LIZ(dataChannel, linkDialog, "MultiCoHostSelectInterestTagListFragment");
        return Unit.LIZ;
    }
}
