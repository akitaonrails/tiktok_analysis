package Y;

import X.C013C;
import X.C090B;
import X.C097T;
import X.C0PEM;
import X.C15O7;
import X.C1621670sIn;
import X.C1641640sp0;
import X.C2296808zG;
import X.C23250099c;
import X.C705430Rll;
import X.C705440Rlm;
import X.InterfaceC1624480sNK;
import X.InterfaceC1625880sPa;
import android.os.Looper;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.sticker.view.internal.search.SearchStickerViewModel;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.AwS547S0100000_3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public class AObserverS121S0300000_3 implements Observer {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                break;
            case 1:
                onChanged$1(this, obj);
                break;
            case 2:
                onChanged$2(this, obj);
                break;
            case 3:
                onChanged$3(this, obj);
                break;
            case 4:
                onChanged$4(this, obj);
                break;
            case 5:
                onChanged$5(this, obj);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onChanged$0(AObserverS121S0300000_3 aObserverS121S0300000_3, Object obj) {
        CategoryEffectModel categoryEffectModel = (CategoryEffectModel) ((C1641640sp0) obj).LIZ;
        if (categoryEffectModel != null) {
            CategoryEffectModel categoryEffectModel2 = (CategoryEffectModel) aObserverS121S0300000_3.l0;
            InterfaceC1625880sPa interfaceC1625880sPa = (InterfaceC1625880sPa) aObserverS121S0300000_3.l1;
            InterfaceC1624480sNK interfaceC1624480sNK = (InterfaceC1624480sNK) aObserverS121S0300000_3.l2;
            categoryEffectModel2.getCategoryKey();
            if (C097T.LIZ()) {
                C1621670sIn c1621670sIn = C1621670sIn.LIZ;
                List<Effect> effects = categoryEffectModel.getEffects();
                c1621670sIn.getClass();
                AwS547S0100000_3 awS547S0100000_3 = new AwS547S0100000_3((List) effects, (List<? extends Effect>) 7);
                ExecutorService executorService = C15O7.LJI;
                if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
                    C15O7.LIZIZ(new ACallableS411S0100000_3((Object) awS547S0100000_3, 6), executorService, null);
                } else {
                    awS547S0100000_3.invoke();
                }
            }
            interfaceC1625880sPa.LJIJJLI(categoryEffectModel2.getCategoryKey(), null, true, false).removeObserver(aObserverS121S0300000_3);
            if (!categoryEffectModel.getEffects().isEmpty()) {
                C1621670sIn c1621670sIn2 = C1621670sIn.LIZ;
                Effect effect = (Effect) ListProtector.get(categoryEffectModel.getEffects(), 0);
                c1621670sIn2.getClass();
                C1621670sIn.LIZIZ(interfaceC1624480sNK, effect);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onChanged$1(AObserverS121S0300000_3 aObserverS121S0300000_3, Object obj) {
        String categoryKey;
        PanelInfoModel panelInfoModel = (PanelInfoModel) ((C1641640sp0) obj).LIZ;
        if (panelInfoModel != null) {
            InterfaceC1625880sPa interfaceC1625880sPa = (InterfaceC1625880sPa) aObserverS121S0300000_3.l0;
            InterfaceC1624480sNK interfaceC1624480sNK = (InterfaceC1624480sNK) aObserverS121S0300000_3.l1;
            LifecycleOwner lifecycleOwner = (LifecycleOwner) aObserverS121S0300000_3.l2;
            C1621670sIn.LIZ.getClass();
            CategoryEffectModel categoryEffectModel = panelInfoModel.getCategoryEffectModel();
            if (categoryEffectModel != null && (categoryKey = categoryEffectModel.getCategoryKey()) != null && categoryKey.length() != 0 && categoryEffectModel != null) {
                interfaceC1625880sPa.LJIIJ(null, true, true, false).removeObserver(aObserverS121S0300000_3);
                interfaceC1625880sPa.LJIJJLI(categoryEffectModel.getCategoryKey(), null, true, false).observe(lifecycleOwner, new AObserverS121S0300000_3(categoryEffectModel, interfaceC1625880sPa, interfaceC1624480sNK, 0));
            }
        }
    }

    public static final void onChanged$2(AObserverS121S0300000_3 aObserverS121S0300000_3, Object obj) {
        String secAuthorUid;
        List list = (List) obj;
        Aweme aweme = (Aweme) aObserverS121S0300000_3.l0;
        if (aweme != null && (secAuthorUid = AwemeExtKt.getSecAuthorUid(aweme)) != null) {
            C013C c013c = (C013C) aObserverS121S0300000_3.l1;
            C705440Rlm c705440Rlm = (C705440Rlm) aObserverS121S0300000_3.l2;
            if (list.contains(secAuthorUid)) {
                c013c.element = true;
                c705440Rlm.LJ(false);
            }
        }
    }

    public static final void onChanged$3(AObserverS121S0300000_3 aObserverS121S0300000_3, Object obj) {
        List list = (List) obj;
        String secAuthorUid = AwemeExtKt.getSecAuthorUid((Aweme) aObserverS121S0300000_3.l0);
        if (secAuthorUid != null) {
            C013C c013c = (C013C) aObserverS121S0300000_3.l1;
            C705430Rll c705430Rll = (C705430Rll) aObserverS121S0300000_3.l2;
            if (list.contains(secAuthorUid)) {
                c013c.element = true;
                c705430Rll.LJ(false);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onChanged$4(AObserverS121S0300000_3 aObserverS121S0300000_3, Object obj) {
        CategoryEffectModel categoryEffectModel = (CategoryEffectModel) ((C1641640sp0) obj).LIZ;
        if (categoryEffectModel != null) {
            InterfaceC1624480sNK interfaceC1624480sNK = (InterfaceC1624480sNK) aObserverS121S0300000_3.l0;
            CategoryEffectModel categoryEffectModel2 = (CategoryEffectModel) aObserverS121S0300000_3.l1;
            SearchStickerViewModel searchStickerViewModel = (SearchStickerViewModel) aObserverS121S0300000_3.l2;
            interfaceC1624480sNK.getStickerRepository().LJFF().LJIJJLI(categoryEffectModel2.getCategoryKey(), null, true, false).removeObserver(aObserverS121S0300000_3);
            searchStickerViewModel.getClass();
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C090B(categoryEffectModel, searchStickerViewModel, null), 3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onChanged$5(AObserverS121S0300000_3 aObserverS121S0300000_3, Object obj) {
        String categoryKey;
        PanelInfoModel panelInfoModel = (PanelInfoModel) ((C1641640sp0) obj).LIZ;
        if (panelInfoModel != null) {
            InterfaceC1624480sNK interfaceC1624480sNK = (InterfaceC1624480sNK) aObserverS121S0300000_3.l0;
            LifecycleOwner lifecycleOwner = (LifecycleOwner) aObserverS121S0300000_3.l1;
            SearchStickerViewModel searchStickerViewModel = (SearchStickerViewModel) aObserverS121S0300000_3.l2;
            CategoryEffectModel categoryEffectModel = panelInfoModel.getCategoryEffectModel();
            if (categoryEffectModel != null && (categoryKey = categoryEffectModel.getCategoryKey()) != null && categoryKey.length() != 0 && categoryEffectModel != null) {
                interfaceC1624480sNK.getStickerRepository().LJFF().LJIIJ(null, true, true, false).removeObserver(aObserverS121S0300000_3);
                interfaceC1624480sNK.getStickerRepository().LJFF().LJIJJLI(categoryEffectModel.getCategoryKey(), null, true, false).observe(lifecycleOwner, new AObserverS121S0300000_3(interfaceC1624480sNK, categoryEffectModel, searchStickerViewModel, 4));
            }
        }
    }

    public AObserverS121S0300000_3(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
