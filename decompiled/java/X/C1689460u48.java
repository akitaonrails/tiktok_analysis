package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.setting.serverpush.IPushSettingService;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushCategory;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushItem;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushItemDisplay;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettingDynamicUI;
import com.ss.android.ugc.aweme.setting.services.IUpdateSettingService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import njp.a;

/* JADX INFO: renamed from: X.0u48, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.reveal.StoryRevealNotificationSheetHelper$runShowFlow$items$1", f = "StoryRevealNotificationSheetHelper.kt", l = {}, m = "invokeSuspend")
public final class C1689460u48 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends C1673620tea>>, Object> {
    public final /* synthetic */ C1689500u4C LL;
    public final /* synthetic */ IPushSettingService LLILLJJLI;
    public final /* synthetic */ IUpdateSettingService LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1689460u48(C1689500u4C c1689500u4C, IPushSettingService iPushSettingService, IUpdateSettingService iUpdateSettingService, InterfaceC1364105Vn<? super C1689460u48> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1689500u4C;
        this.LLILLJJLI = iPushSettingService;
        this.LLILLL = iUpdateSettingService;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1689460u48(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v3, types: [X.13BV] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object arrayList;
        Object next;
        List<PushItem> arrayList2;
        boolean z;
        PushSettingDynamicUI pushSettingDynamicUI;
        List<PushCategory> list;
        C1C7U.LIZ("StoryRevealNotificationSheetHelper@bf38.runShowFlow$items$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1689500u4C c1689500u4C = this.LL;
        IPushSettingService iPushSettingService = this.LLILLJJLI;
        IUpdateSettingService iUpdateSettingService = this.LLILLL;
        c1689500u4C.getClass();
        try {
            PushSettingDynamicUI pushSettingDynamicUILIZIZ = iPushSettingService.LIZIZ();
            if (pushSettingDynamicUILIZIZ == null) {
                arrayList = C13BV.INSTANCE;
            } else {
                iUpdateSettingService.LIZIZ(iPushSettingService.LJII());
                List<PushCategory> list2 = pushSettingDynamicUILIZIZ.categoryList;
                ArrayList arrayList3 = new ArrayList();
                Iterator<PushCategory> it2 = list2.iterator();
                while (it2.hasNext()) {
                    C19719612Di.LJJI(it2.next().itemList, arrayList3);
                }
                Iterator it3 = arrayList3.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        next = it3.next();
                        if (Intrinsics.LJFF(((PushItem) next).itemId, "in_app_push_setting")) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                PushItem pushItem = (PushItem) next;
                if (pushItem != null && (pushSettingDynamicUI = pushItem.subPage) != null && (list = pushSettingDynamicUI.categoryList) != null) {
                    arrayList2 = new ArrayList();
                    Iterator<PushCategory> it4 = list.iterator();
                    while (it4.hasNext()) {
                        C19719612Di.LJJI(it4.next().itemList, arrayList2);
                    }
                } else {
                    arrayList2 = C13BV.INSTANCE;
                }
                arrayList = new ArrayList();
                for (PushItem pushItem2 : arrayList2) {
                    boolean z2 = false;
                    if (u.LJJIIJZLJL(pushItem2.itemId, "in_app_story_reveal", false)) {
                        int iLIZLLL = iUpdateSettingService.LIZLLL(pushItem2.itemId);
                        String str = pushItem2.itemId;
                        PushItemDisplay pushItemDisplay = pushItem2.display;
                        String str2 = pushItemDisplay.title;
                        String str3 = pushItemDisplay.description;
                        if (str3.length() <= 0) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (!z) {
                            str3 = null;
                        }
                        if (iLIZLLL == 1) {
                            z2 = true;
                        }
                        arrayList.add(new C1673620tea(str, str2, str3, z2));
                    }
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            arrayList = C13BV.INSTANCE;
        }
        C1C7U.LIZIZ("StoryRevealNotificationSheetHelper@bf38.runShowFlow$items$1");
        return arrayList;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends C1673620tea>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
