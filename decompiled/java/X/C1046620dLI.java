package X;

import com.bytedance.ies.ugc.aweme.rich.model.vast.model.AdVerification;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: X.0dLI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1046620dLI implements Serializable, Cloneable {
    public String adSystem;
    public String adTitle;
    public List<AdVerification> adVerificationList;
    public List<C1046610dLH> creativeList;
    public String description;
    public Set<String> errorSet;
    public Set<String> impressionSet;
    public Set<String> notViewableSet;
    public String version;
    public Set<String> viewUndeterminedSet;
    public Set<String> viewableSet;

    public Boolean parseContent(String str, int i) {
        return Boolean.valueOf(new C1046600dLG(this).LIZJ(i, str));
    }

    public Boolean parseUri(String str, int i) {
        return Boolean.valueOf(new C1046600dLG(this).LJFF(i, str));
    }

    public Boolean parseContent(String str, int i, InterfaceC1046680dLO interfaceC1046680dLO) {
        return Boolean.valueOf(new C1046600dLG(this, interfaceC1046680dLO).LIZJ(i, str));
    }

    public Boolean parseUri(String str, int i, InterfaceC1046680dLO interfaceC1046680dLO) {
        return Boolean.valueOf(new C1046600dLG(this, interfaceC1046680dLO).LJFF(i, str));
    }

    public Boolean parseContent(String str, int i, InterfaceC1046680dLO interfaceC1046680dLO, InterfaceC1046690dLP interfaceC1046690dLP) {
        return Boolean.valueOf(new C1046600dLG(this, 0).LIZJ(i, str));
    }

    public Boolean parseUri(String str, int i, InterfaceC1046680dLO interfaceC1046680dLO, InterfaceC1046690dLP interfaceC1046690dLP) {
        return Boolean.valueOf(new C1046600dLG(this, 0).LJFF(i, str));
    }
}
