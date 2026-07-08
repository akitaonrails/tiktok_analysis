package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import com.ss.android.ugc.aweme.im.message.template.service.SendMessageEventParcel;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0YcQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C878000YcQ implements C0YTK {
    public boolean LIZ;
    public boolean LIZIZ;
    public final /* synthetic */ InterfaceC878050YcV LIZJ;
    public final /* synthetic */ BaseTemplate LIZLLL;
    public final /* synthetic */ List<IMContact> LJ;
    public final /* synthetic */ C878060YcW LJFF;
    public final /* synthetic */ SendMessageEventParcel LJI;

    @Override // X.C0YTK
    public final void LIZIZ(C0Y8T c0y8t, List<C869590Y9l> list, Map<C869590Y9l, C0YMW> map) {
    }

    @Override // X.C0YTY
    public final void LIZJ(C0Y8T c0y8t, List<? extends C869590Y9l> list) {
    }

    @Override // X.C0YTY
    public final void LJI(C0Y8T c0y8t, C869590Y9l c869590Y9l) {
    }

    @Override // X.C0YTK
    public final void LIZLLL(C0Y8T c0y8t, C869590Y9l c869590Y9l) {
        String scene;
        if (c869590Y9l != null) {
            C878060YcW c878060YcW = this.LJFF;
            SendMessageEventParcel sendMessageEventParcel = this.LJI;
            c878060YcW.getClass();
            for (Map.Entry entry : C878060YcW.LJI(sendMessageEventParcel).entrySet()) {
                c869590Y9l.addLocalExt((String) entry.getKey(), (String) entry.getValue());
            }
        }
        if (this.LIZ) {
            return;
        }
        this.LIZ = true;
        InterfaceC878050YcV interfaceC878050YcV = this.LIZJ;
        if (interfaceC878050YcV != null) {
            BaseTemplate baseTemplate = this.LIZLLL;
            if (c869590Y9l == null || (scene = c869590Y9l.getScene()) == null) {
                scene = "";
            }
            interfaceC878050YcV.LIZ(new C878020YcS(baseTemplate, scene, this.LJ.size()));
        }
    }

    @Override // X.C0YTK
    public final void LJ(C0Y8T c0y8t, C869590Y9l c869590Y9l) {
        if (this.LIZIZ) {
            return;
        }
        this.LIZIZ = true;
        InterfaceC878050YcV interfaceC878050YcV = this.LIZJ;
        if (interfaceC878050YcV != null) {
            final BaseTemplate baseTemplate = this.LIZLLL;
            final int size = this.LJ.size();
            interfaceC878050YcV.LIZ(new AbstractC878010YcR(baseTemplate, size) { // from class: X.0YcU
                public final BaseTemplate LIZ;
                public final int LIZIZ;

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C878040YcU)) {
                        return false;
                    }
                    C878040YcU c878040YcU = (C878040YcU) obj;
                    return Intrinsics.LJFF(this.LIZ, c878040YcU.LIZ) && this.LIZIZ == c878040YcU.LIZIZ;
                }

                public final int hashCode() {
                    BaseTemplate baseTemplate2 = this.LIZ;
                    return ((baseTemplate2 == null ? 0 : baseTemplate2.hashCode()) * 31) + this.LIZIZ;
                }

                public final String toString() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("SendSucceeded(template=");
                    sbLIZ.append(this.LIZ);
                    sbLIZ.append(", numberOfSharedContacts=");
                    sbLIZ.append(this.LIZIZ);
                    sbLIZ.append(')');
                    return C2188811AlT.LIZIZ(sbLIZ);
                }

                {
                    this.LIZ = baseTemplate;
                    this.LIZIZ = size;
                }
            });
        }
    }

    @Override // X.C0YTK
    public final void LJII(C0Y8T c0y8t, C869590Y9l c869590Y9l, C0YMW c0ymw) {
        if (this.LIZIZ) {
            return;
        }
        this.LIZIZ = true;
        InterfaceC878050YcV interfaceC878050YcV = this.LIZJ;
        if (interfaceC878050YcV != null) {
            final BaseTemplate baseTemplate = this.LIZLLL;
            final int size = this.LJ.size();
            interfaceC878050YcV.LIZ(new AbstractC878010YcR(baseTemplate, size) { // from class: X.0YcT
                public final BaseTemplate LIZ;
                public final int LIZIZ;

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C878030YcT)) {
                        return false;
                    }
                    C878030YcT c878030YcT = (C878030YcT) obj;
                    return Intrinsics.LJFF(this.LIZ, c878030YcT.LIZ) && this.LIZIZ == c878030YcT.LIZIZ;
                }

                public final int hashCode() {
                    BaseTemplate baseTemplate2 = this.LIZ;
                    return ((baseTemplate2 == null ? 0 : baseTemplate2.hashCode()) * 31) + this.LIZIZ;
                }

                public final String toString() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("SendFailed(template=");
                    sbLIZ.append(this.LIZ);
                    sbLIZ.append(", numberOfSharedContacts=");
                    sbLIZ.append(this.LIZIZ);
                    sbLIZ.append(')');
                    return C2188811AlT.LIZIZ(sbLIZ);
                }

                {
                    this.LIZ = baseTemplate;
                    this.LIZIZ = size;
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C878000YcQ(InterfaceC878050YcV interfaceC878050YcV, BaseTemplate baseTemplate, List<? extends IMContact> list, C878060YcW c878060YcW, SendMessageEventParcel sendMessageEventParcel) {
        this.LIZJ = interfaceC878050YcV;
        this.LIZLLL = baseTemplate;
        this.LJ = list;
        this.LJFF = c878060YcW;
        this.LJI = sendMessageEventParcel;
    }
}
