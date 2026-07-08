package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.als.LiveEvent;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.TemplateSchemaData;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.interfaces.ITemplateResourceService;
import com.ss.android.ugc.aweme.services.effect.EffectService;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchAssetItemInfo;
import com.ss.android.ugc.effectmanager.effect.model.AssetType;
import com.ss.android.ugc.effectmanager.effect.model.net.AssetItemResponse;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AFwS261S0000000_22;
import kotlin.jvm.internal.AwS423S0200000_22;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nAP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1424270nAP extends C19A3 {
    public final int LLJILLL;
    public ShortVideoContext LLJJ;
    public String LLJJI;
    public final C1DRG LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;

    public final InterfaceC1422770n7z LLLLIILL() {
        return (InterfaceC1422770n7z) this.LLJJIJI.getValue();
    }

    public C1424270nAP() {
        this.LLJILLL = 1;
        this.LLJJIJI = C452501pT.LIZIZ(new AwS566S0100000_22(this, 9));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(15));
    }

    @Override // com.bytedance.scene.Scene
    public final void onDestroyView() {
        super.onDestroyView();
        if (this.LLJILLL == 1) {
            ((InterfaceC1425150nBp) this.LLJJIJIIJIL.getValue()).release();
        }
    }

    public final void LLLLIIIILLL(final String str) {
        String str2;
        CreativeModel creativeModel;
        TemplateSchemaData templateSchemaData;
        final long jCurrentTimeMillis = System.currentTimeMillis();
        C536830L3p.LIZ(new AwS566S0100000_22(this, 7));
        ITemplateResourceService iTemplateResourceService = (ITemplateResourceService) ServiceManager.get().getService(ITemplateResourceService.class);
        InterfaceC1635410sex interfaceC1635410sexCreateMvEffectPlatform = EffectService.Companion.getInstance().createMvEffectPlatform(C545820Lau.LIZIZ(this));
        AssetType assetType = AssetType.PUGC_TEMPLATE;
        ShortVideoContext shortVideoContext = this.LLJJ;
        if (shortVideoContext != null && (creativeModel = shortVideoContext.creativeModel) != null && (templateSchemaData = creativeModel.templateSchemaData) != null) {
            str2 = templateSchemaData.schemaTag;
        } else {
            str2 = null;
        }
        iTemplateResourceService.LIZIZ(interfaceC1635410sexCreateMvEffectPlatform, str, assetType, Intrinsics.LJFF(str2, "template_schema"), true, new IFetchAssetItemInfo() { // from class: X.0n87
            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchAssetItemInfo
            public final void onFailed(ExceptionResult exceptionResult) {
                String str3;
                CreativeModel creativeModel2;
                TemplateSchemaData templateSchemaData2;
                ShortVideoContext shortVideoContext2 = this.LIZ.LLJJ;
                if (shortVideoContext2 != null && (creativeModel2 = shortVideoContext2.creativeModel) != null && (templateSchemaData2 = creativeModel2.templateSchemaData) != null) {
                    str3 = templateSchemaData2.schemaTag;
                } else {
                    str3 = null;
                }
                if (Intrinsics.LJFF(str3, "template_schema")) {
                    C1419580n2q.LJIIJJI(C1419580n2q.LIZ, this.LIZ.LLJJ, jCurrentTimeMillis, null, str, exceptionResult, 4);
                }
                C536830L3p.LIZ(new AwS566S0100000_22(this.LIZ, 8));
            }

            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final void onSuccess(AssetItemResponse assetItemResponse) {
                String str3;
                CreativeModel creativeModel2;
                TemplateSchemaData templateSchemaData2;
                AssetItemResponse assetItemResponse2 = assetItemResponse;
                ShortVideoContext shortVideoContext2 = this.LIZ.LLJJ;
                if (shortVideoContext2 != null && (creativeModel2 = shortVideoContext2.creativeModel) != null && (templateSchemaData2 = creativeModel2.templateSchemaData) != null) {
                    str3 = templateSchemaData2.schemaTag;
                } else {
                    str3 = null;
                }
                if (Intrinsics.LJFF(str3, "template_schema")) {
                    C1419580n2q.LJIIJJI(C1419580n2q.LIZ, this.LIZ.LLJJ, jCurrentTimeMillis, assetItemResponse2, str, null, 16);
                }
                C536830L3p.LIZ(new AwS423S0200000_22(this.LIZ, assetItemResponse2, 3));
            }
        });
    }

    @Override // com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        LiveEvent<Unit> liveEventIz;
        super.onViewCreated(view, bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            this.LLJJ = (ShortVideoContext) bundle2.getParcelable("key_short_video_context");
            this.LLJJI = bundle2.getString("key_template_id");
        }
        C1654320t9S.LIZIZ(this, AFwS261S0000000_22.get$arr$(9));
        C1664590tQ1.LIZLLL(this, "TemplateFeedRootScene", false, new AwS601S0100000_22(this, 10), 2);
        C1664600tQ2.LIZ(this, "TemplateFeedRootScene", new AwS601S0100000_22(this, 14));
        InterfaceC1422770n7z interfaceC1422770n7zLLLLIILL = LLLLIILL();
        if (interfaceC1422770n7zLLLLIILL != null) {
            interfaceC1422770n7zLLLLIILL.jr1(false);
            if (this.LLJILLL == 1) {
                interfaceC1422770n7zLLLLIILL.el2(EnumC1423210n8h.EXIT);
            }
        }
        final String str = this.LLJJI;
        if (str != null && str.length() > 0) {
            InterfaceC1422770n7z interfaceC1422770n7zLLLLIILL2 = LLLLIILL();
            if (interfaceC1422770n7zLLLLIILL2 != null && (liveEventIz = interfaceC1422770n7zLLLLIILL2.Iz()) != null) {
                liveEventIz.LIZ(this, new InterfaceC1441305kZ() { // from class: X.0nAQ
                    @Override // androidx.lifecycle.Observer
                    public final void onChanged(Object obj) {
                        this.LL.LLLLIIIILLL(str);
                    }
                });
            }
            LLLLIIIILLL(str);
        }
    }

    public C1424270nAP(String str, ShortVideoContext shortVideoContext, C1DRG c1drg) {
        this();
        this.LLJJ = shortVideoContext;
        this.LLJJI = str;
        this.LLJJIII = c1drg;
        this.LLJILLL = 2;
    }

    @Override // X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.wu, viewGroup, false);
    }

    @Override // X.C19A3, com.bytedance.scene.Scene
    public final /* bridge */ /* synthetic */ View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return onCreateView(layoutInflater, viewGroup, bundle);
    }
}
