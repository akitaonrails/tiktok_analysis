package X;

import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.HashSet;

/* JADX INFO: renamed from: X.0oYw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1477920oYw implements InterfaceC1477240oXq {
    public static final C1477920oYw LIZIZ = new C1477920oYw();
    public static final HashSet<String> LIZJ = new HashSet<>();

    @Override // X.InterfaceC1477240oXq
    public final /* synthetic */ boolean LIZIZ() {
        return true;
    }

    @Override // X.InterfaceC1477240oXq
    public final /* synthetic */ C1477210oXn LIZJ(InterfaceC1477990oZ3 interfaceC1477990oZ3) {
        return C1477960oZ0.LIZIZ(interfaceC1477990oZ3);
    }

    @Override // X.InterfaceC1477240oXq
    public final String getName() {
        return "LocalVideoUrlHook";
    }

    @Override // X.InterfaceC1477240oXq
    public final /* synthetic */ boolean isValid() {
        return true;
    }

    @Override // X.InterfaceC1477240oXq
    public final C1477210oXn LIZ(C1477250oXr c1477250oXr) {
        C1476750oX3 c1476750oX3;
        C1478000oZ4 c1478000oZ4 = c1477250oXr.LIZJ;
        if (c1478000oZ4 != null && (c1476750oX3 = c1478000oZ4.LIZ) != null) {
            SimVideoUrlModel simVideoUrlModel = new SimVideoUrlModel();
            if (c1476750oX3.getUrlKey() != null) {
                simVideoUrlModel.setSourceId(c1476750oX3.getUrlKey());
            }
            if (c1476750oX3.getFileHash() != null) {
                simVideoUrlModel.setFileHash(c1476750oX3.getFileHash());
            }
            simVideoUrlModel.setHeight(c1476750oX3.getHeight());
            simVideoUrlModel.setWidth(c1476750oX3.getWidth());
            simVideoUrlModel.setSize(c1476750oX3.getSize());
            if (c1476750oX3.getUri() != null) {
                simVideoUrlModel.setUri(c1476750oX3.getUri());
            }
            if (c1476750oX3.getUrlKey() != null) {
                simVideoUrlModel.setUrlKey(c1476750oX3.getUrlKey());
            }
            if (c1476750oX3.getUrlList() != null) {
                simVideoUrlModel.setUrlList(c1476750oX3.getUrlList());
            }
            if (c1476750oX3.getaK() != null) {
                simVideoUrlModel.setaK(c1476750oX3.getaK());
            }
            if (LIZJ.contains(simVideoUrlModel.getSourceId())) {
                return new C1477210oXn(simVideoUrlModel.getUri());
            }
            return c1477250oXr.LIZJ(c1478000oZ4);
        }
        return c1477250oXr.LIZJ(c1478000oZ4);
    }

    @Override // X.InterfaceC1477240oXq
    public final C1477210oXn LIZLLL(C1477250oXr c1477250oXr) {
        SimVideoUrlModel simVideoUrlModel;
        C1477270oXt c1477270oXt = c1477250oXr.LIZIZ;
        if (c1477270oXt != null && (simVideoUrlModel = c1477270oXt.LIZ) != null) {
            if (LIZJ.contains(simVideoUrlModel.getSourceId())) {
                return new C1477210oXn(simVideoUrlModel.getUri());
            }
            return c1477250oXr.LIZLLL(c1477270oXt);
        }
        return c1477250oXr.LIZLLL(c1477270oXt);
    }
}
