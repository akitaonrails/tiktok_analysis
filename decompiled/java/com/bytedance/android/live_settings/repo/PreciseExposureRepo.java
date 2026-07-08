package com.bytedance.android.live_settings.repo;

import X.C01GW;
import X.C452501pT;
import com.bytedance.keva.Keva;
import kotlin.jvm.internal.AFwS225S0000000_34;

/* JADX INFO: loaded from: classes35.dex */
public final class PreciseExposureRepo extends BaseRepo {
    public static final Companion Companion = new Companion();
    public static final C01GW<PreciseExposureRepo> INATANCE$delegate = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(13));

    public static final class Companion {
        public final PreciseExposureRepo getINATANCE() {
            return PreciseExposureRepo.INATANCE$delegate.getValue();
        }
    }

    @Override // com.bytedance.android.live_settings.repo.BaseRepo
    public String getTag() {
        return "PreciseExposureRepo";
    }

    @Override // com.bytedance.android.live_settings.repo.BaseRepo
    public Keva getDataRepo() {
        return Keva.getRepo("live_precise_exposure_repo");
    }
}
