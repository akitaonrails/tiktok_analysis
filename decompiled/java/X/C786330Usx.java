package X;

import android.text.TextUtils;
import com.bytedance.android.live.effect.navi.NaviAvatarListViewModel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.ss.android.ugc.effectmanager.EffectManager;
import com.ss.android.ugc.effectmanager.effect.listener.IIsTagNeedUpdatedListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0Usx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C786330Usx implements InterfaceC1478005qU {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC1478005qU
    public final void subscribe(C09AJ<Object> c09aj) {
        switch (this.$t) {
            case 0:
                subscribe$0(this, c09aj);
                break;
            case 1:
                subscribe$1(this, c09aj);
                break;
            case 2:
                subscribe$2(this, c09aj);
                break;
            case 3:
                subscribe$3(this, c09aj);
                break;
            case 4:
                subscribe$4(this, c09aj);
                break;
        }
    }

    public static final void subscribe$0(C786330Usx c786330Usx, C09AJ c09aj) {
        String id;
        C1C7U.LIZ("LiveComposerFilterManager@7704.checkUpdate$2$1");
        C0U5Z c0u5z = (C0U5Z) c786330Usx.l0;
        Effect effect = ((LiveEffect) c786330Usx.l1).LIZJ;
        String tagsUpdatedAt = null;
        if (effect != null) {
            id = effect.getId();
        } else {
            id = null;
        }
        Effect effect2 = ((LiveEffect) c786330Usx.l1).LIZJ;
        if (effect2 != null) {
            tagsUpdatedAt = effect2.getTagsUpdatedAt();
        }
        final LiveEffect liveEffect = (LiveEffect) c786330Usx.l1;
        final C19482611Ke c19482611Ke = (C19482611Ke) c09aj;
        IIsTagNeedUpdatedListener iIsTagNeedUpdatedListener = new IIsTagNeedUpdatedListener() { // from class: X.0UHy
            @Override // com.ss.android.ugc.effectmanager.effect.listener.IIsTagNeedUpdatedListener
            public final void onTagNeedNotUpdate() {
                liveEffect.LJJZ(false);
                c19482611Ke.onComplete();
            }

            @Override // com.ss.android.ugc.effectmanager.effect.listener.IIsTagNeedUpdatedListener
            public final void onTagNeedUpdate() {
                liveEffect.LJJZ(true);
                c19482611Ke.onComplete();
            }
        };
        if (c0u5z.LIZJ != null && id != null && tagsUpdatedAt != null && !TextUtils.equals("NULL", tagsUpdatedAt.toUpperCase(Locale.ROOT))) {
            EffectManager effectManager = c0u5z.LIZJ;
            if (effectManager != null) {
                effectManager.isTagUpdated(id, tagsUpdatedAt, iIsTagNeedUpdatedListener);
            }
        } else {
            iIsTagNeedUpdatedListener.onTagNeedNotUpdate();
        }
        C1C7U.LIZIZ("LiveComposerFilterManager@7704.checkUpdate$2$1");
    }

    public static final void subscribe$1(C786330Usx c786330Usx, C09AJ c09aj) {
        C1C7U.LIZ("LivePreviewCardDegradeManager@238e.registerDegradeListener$1");
        ConcurrentHashMap<EnumC755930Tl1, CopyOnWriteArrayList<InterfaceC755910Tkz>> concurrentHashMap = C755900Tky.LLILLJJLI;
        CopyOnWriteArrayList<InterfaceC755910Tkz> copyOnWriteArrayList = concurrentHashMap.get((EnumC755930Tl1) c786330Usx.l0);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            concurrentHashMap.put((EnumC755930Tl1) c786330Usx.l0, copyOnWriteArrayList);
        }
        copyOnWriteArrayList.add((InterfaceC755910Tkz) c786330Usx.l1);
        c09aj.onNext(Unit.LIZ);
        C1C7U.LIZIZ("LivePreviewCardDegradeManager@238e.registerDegradeListener$1");
    }

    public static final void subscribe$2(C786330Usx c786330Usx, C09AJ c09aj) {
        C1C7U.LIZ("NaviAvatarRequest@d172.getFetchEffectsObservable$1");
        NaviAvatarListViewModel naviAvatarListViewModel = ((C0UCV) c786330Usx.l0).LIZ;
        List list = (List) c786330Usx.l1;
        C581070Mqf c581070Mqf = new C581070Mqf((C19482611Ke) c09aj, 2);
        if (!((ArrayList) naviAvatarListViewModel.LLIZLLLIL).isEmpty()) {
            C766720U5u c766720U5u = C766720U5u.LIZ;
            List<Effect> list2 = naviAvatarListViewModel.LLIZLLLIL;
            ArrayList arrayList = new ArrayList();
            for (Object obj : (ArrayList) list2) {
                if (list.contains(((Effect) obj).getName())) {
                    arrayList.add(obj);
                }
            }
            c766720U5u.getClass();
            C766720U5u.LJIILL().downloadEffectList(arrayList, c581070Mqf);
        }
        C1C7U.LIZIZ("NaviAvatarRequest@d172.getFetchEffectsObservable$1");
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static final void subscribe$3(C786330Usx c786330Usx, C09AJ c09aj) {
        C1C7U.LIZ("LiveEffectDataProvider$LiveFetchEffectChannelFromCacheListener@bd48.onSuccess$1");
        C0U65 c0u65 = (C0U65) c786330Usx.l0;
        C0U69<T> c0u69 = c0u65.LIZJ;
        List listLJI = c0u65.LIZIZ.LJI((EffectChannelResponse) c786330Usx.l1);
        c0u69.LJIIIZ((List<C0U74<T>>) listLJI);
        c09aj.onNext(listLJI);
        C1C7U.LIZIZ("LiveEffectDataProvider$LiveFetchEffectChannelFromCacheListener@bd48.onSuccess$1");
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static final void subscribe$4(C786330Usx c786330Usx, C09AJ c09aj) {
        C1C7U.LIZ("LiveEffectDataProvider$LiveFetchEffectChannelFromRemoteListener@1c4f.onSuccess$1");
        C0U67 c0u67 = (C0U67) c786330Usx.l0;
        C0U69<T> c0u69 = c0u67.LIZJ;
        List listLJI = c0u67.LIZIZ.LJI((EffectChannelResponse) c786330Usx.l1);
        c0u69.LJIIIZ((List<C0U74<T>>) listLJI);
        c09aj.onNext(listLJI);
        C1C7U.LIZIZ("LiveEffectDataProvider$LiveFetchEffectChannelFromRemoteListener@1c4f.onSuccess$1");
    }

    public C786330Usx(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
