package X;

import com.bytedance.vast.model.AdVerification;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: X.0dJ7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1045270dJ7 implements Serializable, Cloneable {
    public String adSystem;
    public String adTitle;
    public List<AdVerification> adVerificationList;
    public List<C1045260dJ6> creativeList;
    public String description;
    public Set<String> errorSet;
    public Set<String> impressionSet;
    public Set<String> notViewableSet;
    public String version;
    public Set<String> viewUndeterminedSet;
    public Set<String> viewableSet;

    public Boolean parseContent(String str, int i) {
        return Boolean.valueOf(new C1046590dLF(this).LIZJ(i, str));
    }

    public Boolean parseUri(String str, int i) {
        return Boolean.valueOf(new C1046590dLF(this).LJFF(i, str));
    }

    public Boolean parseContent(String str, int i, InterfaceC1045310dJB interfaceC1045310dJB) {
        return Boolean.valueOf(new C1046590dLF(this, interfaceC1045310dJB).LIZJ(i, str));
    }

    public Boolean parseUri(String str, int i, InterfaceC1045310dJB interfaceC1045310dJB) {
        return Boolean.valueOf(new C1046590dLF(this, interfaceC1045310dJB).LJFF(i, str));
    }

    public Boolean parseContent(String str, int i, InterfaceC1045310dJB interfaceC1045310dJB, InterfaceC1046660dLM interfaceC1046660dLM) {
        return Boolean.valueOf(new C1046590dLF(this, interfaceC1045310dJB, interfaceC1046660dLM).LIZJ(i, str));
    }

    public Boolean parseUri(String str, int i, InterfaceC1045310dJB interfaceC1045310dJB, InterfaceC1046660dLM interfaceC1046660dLM) {
        return Boolean.valueOf(new C1046590dLF(this, interfaceC1045310dJB, interfaceC1046660dLM).LJFF(i, str));
    }
}
