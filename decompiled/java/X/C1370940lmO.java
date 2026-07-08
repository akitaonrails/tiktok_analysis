package X;

import android.os.Parcel;
import com.ss.android.ugc.aweme.im.message.template.service.SendMessageTemplateDynamicTask;
import com.ss.android.ugc.aweme.im.message.template.service.SendMessageTemplateTask;

/* JADX INFO: renamed from: X.0lmO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C1370940lmO extends C1370910lmL {
    public SendMessageTemplateTask LJIIIIZZ;
    public SendMessageTemplateDynamicTask LJIIIZ;

    @Override // X.C1370910lmL
    public final /* bridge */ /* synthetic */ C1370910lmL LIZ(Parcel parcel) {
        throw null;
    }

    public final void LIZJ(Parcel parcel) {
        super.LIZ(parcel);
        this.LJIIIIZZ = (SendMessageTemplateTask) parcel.readParcelable(SendMessageTemplateTask.class.getClassLoader());
        this.LJIIIZ = (SendMessageTemplateDynamicTask) parcel.readParcelable(SendMessageTemplateDynamicTask.class.getClassLoader());
    }

    public final void LIZIZ(String str, String str2) {
        C786410Ut5.LJJJI(str, str2, this.LJII);
    }
}
