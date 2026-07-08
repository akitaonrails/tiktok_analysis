package X;

import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import java.util.List;
import kotlin.jvm.internal.AwS569S0100000_25;
import muk.p1;

/* JADX INFO: renamed from: X.0sOj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1625350sOj extends p1 {
    public final ShortVideoContext LJIIL;

    @Override // muk.p1, X.C1625320sOg
    public final InterfaceC1628820sUK LIZIZ(C1629320sV8 c1629320sV8, InterfaceC1635390sev interfaceC1635390sev, InterfaceC1629550sVV interfaceC1629550sVV, List<? extends EffectCategoryModel> list, boolean z) {
        C1629150sUr c1629150sUr = (C1629150sUr) super.LIZIZ(c1629320sV8, interfaceC1635390sev, interfaceC1629550sVV, list, false);
        c1629150sUr.LJI = new AwS569S0100000_25(this, 407);
        return c1629150sUr;
    }

    public C1625350sOj(C19GS c19gs, LifecycleOwner lifecycleOwner, ShortVideoContext shortVideoContext, C1629320sV8 c1629320sV8, InterfaceC1629550sVV interfaceC1629550sVV, InterfaceC1635390sev interfaceC1635390sev, List list) {
        super(c19gs, lifecycleOwner, shortVideoContext, c1629320sV8, interfaceC1629550sVV, interfaceC1635390sev, list);
        this.LJIIL = shortVideoContext;
    }
}
