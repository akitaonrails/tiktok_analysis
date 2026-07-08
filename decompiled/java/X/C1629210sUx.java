package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.net.EffectListResponse;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: renamed from: X.0sUx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1629210sUx implements InterfaceC23046091g {
    public final C11RK<C1629220sUy> LIZ = new C11RK<>();
    public InterfaceC23044091e LIZIZ;

    @Override // X.InterfaceC23046091g
    public final C19475711Hn LIZLLL() {
        C11RK<C1629220sUy> c11rk = this.LIZ;
        c11rk.getClass();
        return new C19475711Hn(c11rk);
    }

    @Override // X.InterfaceC23046091g
    public final void LIZ(InterfaceC23044091e interfaceC23044091e) {
        this.LIZIZ = interfaceC23044091e;
    }

    @Override // X.InterfaceC1629260sV2
    public final void LIZIZ(C1629230sUz c1629230sUz) {
        InterfaceC23044091e interfaceC23044091e = this.LIZIZ;
        if (interfaceC23044091e != null) {
            ArrayList arrayList = new ArrayList(C13LP.LJJJJI(c1629230sUz.LIZ));
            final C1629230sUz c1629230sUz2 = new C1629230sUz(arrayList, c1629230sUz.LIZIZ, c1629230sUz.LIZJ, c1629230sUz.LIZLLL, c1629230sUz.LJ, c1629230sUz.LJFF);
            int i = 0;
            for (Object obj : arrayList) {
                int i2 = i + 1;
                if (i >= 0) {
                    String str = (String) obj;
                    if (str.length() > 0) {
                        interfaceC23044091e.LJJI().LIZ(Collections.singletonList(str), c1629230sUz.LIZLLL, new IFetchEffectListByIdsListener() { // from class: X.0sUw
                            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener
                            public final void onFail(ExceptionResult exceptionResult) {
                            }

                            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                            public final void onSuccess(EffectListResponse effectListResponse) {
                                InterfaceC23044091e interfaceC23044091e2;
                                InterfaceC1633140sbI interfaceC1633140sbILJFF;
                                InterfaceC23044091e interfaceC23044091e3;
                                InterfaceC1633140sbI interfaceC1633140sbILJFF2;
                                EffectListResponse effectListResponse2 = effectListResponse;
                                if (effectListResponse2 != null) {
                                    List<Effect> collection = effectListResponse2.getCollection();
                                    if (collection != null && (!collection.isEmpty()) && (interfaceC23044091e3 = this.LIZ.LIZIZ) != null && (interfaceC1633140sbILJFF2 = interfaceC23044091e3.LJFF()) != null) {
                                        interfaceC1633140sbILJFF2.LJIJ(collection);
                                    }
                                    List<Effect> bindEffects = effectListResponse2.getBindEffects();
                                    if (bindEffects != null && (!bindEffects.isEmpty()) && (interfaceC23044091e2 = this.LIZ.LIZIZ) != null && (interfaceC1633140sbILJFF = interfaceC23044091e2.LJFF()) != null) {
                                        interfaceC1633140sbILJFF.LJII(bindEffects);
                                    }
                                    List<Effect> data = effectListResponse2.getData();
                                    if (data != null && (!data.isEmpty())) {
                                        C1629210sUx c1629210sUx = this.LIZ;
                                        C1629230sUz c1629230sUz3 = c1629230sUz2;
                                        c1629210sUx.LIZ.onNext(new C1629220sUy(data, c1629230sUz3.LIZIZ, c1629230sUz3.LIZJ, c1629230sUz3.LIZLLL, c1629230sUz3.LJ, c1629230sUz3.LJFF));
                                    }
                                }
                            }
                        });
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
    }

    @Override // X.InterfaceC1629260sV2
    public final void LIZJ(C1629220sUy c1629220sUy) {
        String id;
        InterfaceC23044091e interfaceC23044091e = this.LIZIZ;
        if (interfaceC23044091e != null) {
            List<Effect> list = c1629220sUy.LIZ;
            HashSet hashSet = new HashSet();
            ArrayList arrayList = new ArrayList();
            for (Effect effect : list) {
                Effect effect2 = effect;
                String parentId = effect2.getParentId();
                if (parentId != null && parentId.length() != 0) {
                    id = effect2.getParentId();
                } else {
                    id = effect2.getId();
                }
                if (hashSet.add(id)) {
                    arrayList.add(effect);
                }
            }
            final ArrayList arrayList2 = new ArrayList(arrayList);
            final C1629220sUy c1629220sUy2 = new C1629220sUy(arrayList2, c1629220sUy.LIZIZ, c1629220sUy.LIZJ, c1629220sUy.LIZLLL, c1629220sUy.LJ, c1629220sUy.LJFF);
            boolean z = true;
            final int i = 0;
            for (Object obj : arrayList2) {
                int i2 = i + 1;
                if (i >= 0) {
                    Effect effect3 = (Effect) obj;
                    String parentId2 = effect3.getParentId();
                    if (parentId2 != null && parentId2.length() != 0) {
                        interfaceC23044091e.LJJI().LIZ(Collections.singletonList(effect3.getParentId()), c1629220sUy.LIZLLL, new IFetchEffectListByIdsListener() { // from class: X.0sUv
                            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener
                            public final void onFail(ExceptionResult exceptionResult) {
                                this.LIZ.LIZ.onNext(c1629220sUy2);
                            }

                            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                            public final void onSuccess(EffectListResponse effectListResponse) {
                                InterfaceC23044091e interfaceC23044091e2;
                                InterfaceC1633140sbI interfaceC1633140sbILJFF;
                                InterfaceC23044091e interfaceC23044091e3;
                                InterfaceC1633140sbI interfaceC1633140sbILJFF2;
                                EffectListResponse effectListResponse2 = effectListResponse;
                                if (effectListResponse2 != null) {
                                    List<Effect> collection = effectListResponse2.getCollection();
                                    if (collection != null && (!collection.isEmpty()) && (interfaceC23044091e3 = this.LIZ.LIZIZ) != null && (interfaceC1633140sbILJFF2 = interfaceC23044091e3.LJFF()) != null) {
                                        interfaceC1633140sbILJFF2.LJIJ(collection);
                                    }
                                    List<Effect> bindEffects = effectListResponse2.getBindEffects();
                                    if (bindEffects != null && (!bindEffects.isEmpty()) && (interfaceC23044091e2 = this.LIZ.LIZIZ) != null && (interfaceC1633140sbILJFF = interfaceC23044091e2.LJFF()) != null) {
                                        interfaceC1633140sbILJFF.LJII(bindEffects);
                                    }
                                    List<Effect> data = effectListResponse2.getData();
                                    if (data != null && (!data.isEmpty())) {
                                        List<Effect> list2 = arrayList2;
                                        int i3 = i;
                                        C1629210sUx c1629210sUx = this.LIZ;
                                        C1629220sUy c1629220sUy3 = c1629220sUy2;
                                        ListProtector.set(list2, i3, ListProtector.get(data, 0));
                                        c1629210sUx.LIZ.onNext(c1629220sUy3);
                                    }
                                }
                            }
                        });
                        z = false;
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            if (z) {
                this.LIZ.onNext(c1629220sUy2);
                return;
            }
            return;
        }
        this.LIZ.onNext(c1629220sUy);
    }
}
