package X;

import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Arrays;

/* JADX INFO: renamed from: X.0qUS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1552020qUS extends AbstractC1552800qVi {
    public final /* synthetic */ AbstractC1552040qUU LIZ;

    public C1552020qUS(AbstractC1552040qUU abstractC1552040qUU) {
        this.LIZ = abstractC1552040qUU;
    }

    @Override // X.AbstractC1552800qVi
    public final void LIZ(C1552250qUp c1552250qUp, AbstractC1552240qUo abstractC1552240qUo, Throwable th) {
        UpdatePackage updatePackage = (UpdatePackage) c1552250qUp.getOutputForType(C1553440qWk.class);
        C1553130qWF.LIZ("gecko-debug-tag", "onUpdateFailed", updatePackage.toString(), th.getMessage());
        if (updatePackage.getIsZstd() && !updatePackage.getUpdateWithPatch() && updatePackage.hasFallback()) {
            AbstractC1552040qUU abstractC1552040qUU = this.LIZ;
            C1553130qWF.LIZ("gecko-debug-tag", "update failed with zstd, now use zip!", updatePackage.toString());
            OptionCheckUpdateParams optionCheckUpdateParams = new OptionCheckUpdateParams();
            optionCheckUpdateParams.setChannelUpdatePriority(2);
            optionCheckUpdateParams.setListener(abstractC1552040qUU);
            C1551530qTf c1551530qTfLJFF = C797990VSb.LIZ.LJFF();
            if (c1551530qTfLJFF != null) {
                try {
                    C1551960qUM.LJIIIIZZ(c1551530qTfLJFF, optionCheckUpdateParams).proceed(Arrays.asList(updatePackage.fallbackInstance()));
                    return;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C1553130qWF.LIZ("gecko-debug-tag", "update failed with zstd and zip!", e.getMessage());
                    return;
                }
            }
            return;
        }
        String channel = updatePackage.getChannel();
        AbstractC1552040qUU abstractC1552040qUU2 = this.LIZ;
        if (abstractC1552040qUU2 != null) {
            abstractC1552040qUU2.LJIJI(channel, th);
            this.LIZ.LJIJ(updatePackage, th);
        }
    }

    @Override // X.AbstractC1552800qVi
    public final void LIZLLL(C1552250qUp c1552250qUp, AbstractC1552240qUo abstractC1552240qUo, Throwable th) {
        LIZ(c1552250qUp, abstractC1552240qUo, th);
    }
}
