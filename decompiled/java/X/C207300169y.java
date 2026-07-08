package X;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.hybrid.spark.SparkContext;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import com.ss.android.ugc.aweme.im.message.template.component.VideoCoverComponent;
import com.ss.android.ugc.aweme.internalshare.impl.chatroomeasteregg.assem.EasterEggForShareAssem;
import com.ss.android.ugc.aweme.live.alphaplayer.model.DataSource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.169y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.ss.android.ugc.aweme.internalshare.impl.chatroomeasteregg.assem.EasterEggForShareAssem$showVideoRain$1$3", f = "EasterEggForShareAssem.kt", l = {570}, m = "invokeSuspend")
public final class C207300169y extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ EasterEggForShareAssem LLILLJJLI;
    public final /* synthetic */ List<C0NPA> LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ long LLILZIL;
    public final /* synthetic */ DataSource LLILZLL;
    public final /* synthetic */ Bitmap LLIZ;
    public final /* synthetic */ List<String> LLIZLLLIL;
    public final /* synthetic */ List<C0NPA> LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C207300169y(EasterEggForShareAssem easterEggForShareAssem, List<C0NPA> list, String str, long j, DataSource dataSource, Bitmap bitmap, List<String> list2, List<C0NPA> list3, InterfaceC1364105Vn<? super C207300169y> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = easterEggForShareAssem;
        this.LLILLL = list;
        this.LLILZ = str;
        this.LLILZIL = j;
        this.LLILZLL = dataSource;
        this.LLIZ = bitmap;
        this.LLIZLLLIL = list2;
        this.LLJ = list3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C207300169y(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object objLJJJLL;
        ImageComponent imageComponent;
        List<String> list;
        FrameLayout frameLayout;
        C1C7U.LIZ("EasterEggForShareAssem@d88a.showVideoRain$1$3");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            final EasterEggForShareAssem easterEggForShareAssem = this.LLILLJJLI;
            List<C0NPA> list2 = this.LLILLL;
            String str = this.LLILZ;
            easterEggForShareAssem.getClass();
            AbstractC1542200qEc abstractC1542200qEc = new AbstractC1542200qEc() { // from class: X.15fG
                @Override // X.AbstractC1537870q7d
                public final void LJLIIIL(InterfaceC1541990qEH interfaceC1541990qEH) {
                }

                @Override // X.AbstractC1537870q7d
                public final void LJLIIL(InterfaceC1541990qEH interfaceC1541990qEH, String str2) {
                }

                @Override // X.AbstractC1537870q7d
                public final void LJL(InterfaceC1541990qEH interfaceC1541990qEH, String str2, C1542120qEU c1542120qEU) {
                    FrameLayout frameLayout2;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onLoadFailed(url=");
                    sbLIZ.append(str2);
                    sbLIZ.append(", hybridKitError=");
                    sbLIZ.append(c1542120qEU.LIZ());
                    sbLIZ.append(')');
                    C2188811AlT.LIZIZ(sbLIZ);
                    View viewLJJIJL = easterEggForShareAssem.LJJIJL();
                    if ((viewLJJIJL instanceof FrameLayout) && (frameLayout2 = (FrameLayout) viewLJJIJL) != null) {
                        C786410Ut5.LJJJZ(easterEggForShareAssem.LLJJIJI, frameLayout2);
                    }
                }
            };
            AbstractC1542070qEP abstractC1542070qEP = new AbstractC1542070qEP() { // from class: X.18oC
                @Override // X.InterfaceC1163110gNB
                public final void LJIIJ(Context context) {
                }

                @Override // X.InterfaceC1163110gNB
                public final View LJJJLIIL(InterfaceC1051240dSk interfaceC1051240dSk) {
                    return null;
                }

                @Override // X.InterfaceC1163110gNB
                public final View LJJL() {
                    return null;
                }
            };
            if (easterEggForShareAssem.LLJJIJI != null) {
                View viewLJJIJL = easterEggForShareAssem.LJJIJL();
                if ((viewLJJIJL instanceof FrameLayout) && (frameLayout = (FrameLayout) viewLJJIJL) != null) {
                    C786410Ut5.LJJJZ(easterEggForShareAssem.LLJJIJI, frameLayout);
                }
            }
            C1537900q7g c1537900q7g = C1541950qED.LIZJ;
            MutableContextWrapper mutableContextWrapper = new MutableContextWrapper(easterEggForShareAssem.LJJIJL().getContext());
            SparkContext sparkContext = new SparkContext();
            sparkContext.LJJLIIJ("aweme://roma_redirect/?spark_page=im_easter_egg_for_share_gravity");
            ArrayList arrayList = new ArrayList();
            for (C0NPA c0npa : list2) {
                if (((Boolean) C0BQP.LIZ.getValue()).booleanValue()) {
                    VideoCoverComponent videoCoverComponent = c0npa.LJI;
                    if (videoCoverComponent != null && (imageComponent = videoCoverComponent.coverImage) != null && (list = imageComponent.urls) != null) {
                        objLJJJLL = C13LP.LJJJLL(list);
                    }
                } else {
                    objLJJJLL = c0npa.LJIIJ;
                }
                if (objLJJJLL != null) {
                    arrayList.add(objLJJJLL);
                }
            }
            sparkContext.LJJLIIIJ(arrayList, "video_covers");
            sparkContext.LJJLIIIJ(str, "trigger_id");
            String str2 = "1";
            if ("samsung".equalsIgnoreCase(Build.BRAND)) {
                obj2 = "1";
            } else {
                obj2 = CardStruct.IStatusCode.DEFAULT;
            }
            sparkContext.LJJLIIIJ(obj2, "is_sumsang");
            Context context = easterEggForShareAssem.getContext();
            if (context == null || !C960203pA.LIZIZ(context)) {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            sparkContext.LJJLIIIJ(str2, "is_dark_mode");
            sparkContext.LJJJJZI(abstractC1542200qEc);
            sparkContext.LJJLIIIJLJLI(abstractC1542070qEP);
            c1537900q7g.getClass();
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ = new C1541950qED(mutableContextWrapper, sparkContext).LIZ(false);
            easterEggForShareAssem.LLJJIJI = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ;
            InterfaceC1541990qEH kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ.getKitView();
            if (kitView != null) {
                kitView.load();
            }
            Map map = (Map) this.LLILLJJLI.LLJJI.getValue();
            String str3 = this.LLILZ;
            map.put(str3, new C16A0(this.LLILZIL, this.LLIZ, this.LLILLJJLI, this.LLILZLL, str3, this.LLIZLLLIL, this.LLILLL, this.LLJ));
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(Mp4ScreenVideoLoadTimeout.CONTROL, this) == objLJFF) {
                C1C7U.LIZIZ("EasterEggForShareAssem@d88a.showVideoRain$1$3");
                return objLJFF;
            }
        }
        if (((Map) this.LLILLJJLI.LLJJI.getValue()).remove(this.LLILZ) != null) {
            this.LLILLJJLI.So(this.LLILZIL, "high_frequency_sharing", this.LLILZ, "not_shown", "webview_ready_timeout");
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EasterEggForShareAssem@d88a.showVideoRain$1$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
