package com.bytedance.android.live.liveinteract.multiguestv3.main.audience.guide;

/* JADX INFO: loaded from: classes16.dex */
public final class ApplyGuideAbilityImpl implements IApplyGuideAbility {
    public final ApplyGuideViewModel LL;

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.audience.guide.IApplyGuideAbility
    public final ApplyGuideViewModel getViewModel() {
        return this.LL;
    }

    public ApplyGuideAbilityImpl(ApplyGuideViewModel applyGuideViewModel) {
        this.LL = applyGuideViewModel;
    }
}
