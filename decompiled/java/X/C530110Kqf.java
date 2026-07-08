package X;

import Y.ACallableS415S0100000_8;
import android.content.Context;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Kqf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C530110Kqf implements InterfaceC528880Kog {
    public final Context LIZ;
    public boolean LIZIZ = true;

    @Override // X.InterfaceC528880Kog
    public final void setEnterFrom(String str) {
    }

    public C530110Kqf(Context context) {
        this.LIZ = context;
    }

    @Override // X.InterfaceC528880Kog
    public final void LIZ(final MediaModel mediaModel, boolean z, long j, long j2, boolean z2, boolean z3, boolean z4, final Function1<? super C529210KpD, Unit> function1, final Function1<? super C529210KpD, Unit> function12) {
        final C0MPH c0mphLIZLLL;
        final long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.LIZIZ) {
            C194353111z.LIZ.LIZIZ(1018, C0MVY.SHOW, C0LD3.PROGRESS_WITH_MESSAGE, C0LEP.CLOSE_GONE);
            Context context = this.LIZ;
            c0mphLIZLLL = C0MPH.LIZLLL(context, context.getString(2131845263));
        } else {
            c0mphLIZLLL = null;
        }
        C15O7.LIZJ(new ACallableS415S0100000_8(mediaModel, 0)).LJ(new InterfaceC2385309Wh() { // from class: X.0Kqg
            @Override // X.InterfaceC2385309Wh
            public final Object then(C15O7 c15o7) {
                C1C7U.LIZ("Editor1VideoLegalChecker@e914.isCanImport$2");
                Integer num = (Integer) c15o7.LJIIL();
                String str = mediaModel.fileName;
                this.getClass();
                String strLIZ = C1918707fN.LIZ(str);
                C0MPH c0mph = c0mphLIZLLL;
                if (c0mph != null) {
                    C0FNU.LIZ(c0mph);
                    this.getClass();
                    C194353111z.LIZ.LIZIZ(1018, C0MVY.DISMISS, C0LD3.PROGRESS_WITH_MESSAGE, C0LEP.CLOSE_GONE);
                }
                if (num.intValue() >= 0) {
                    if (num.intValue() > 0) {
                        mediaModel.duration = num.intValue();
                    }
                    Function1<C529210KpD, Unit> function13 = function1;
                    this.getClass();
                    function13.invoke(new C529210KpD(0, "Editor1VideoLegalChecker", System.currentTimeMillis() - jCurrentTimeMillis, strLIZ, "", true));
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    this.getClass();
                    sbLIZ.append("Editor1VideoLegalChecker");
                    sbLIZ.append(" ImportError:");
                    sbLIZ.append(num);
                    C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                    Function1<C529210KpD, Unit> function14 = function12;
                    this.getClass();
                    function14.invoke(new C529210KpD(num.intValue(), "Editor1VideoLegalChecker", System.currentTimeMillis() - jCurrentTimeMillis, strLIZ, "", false));
                }
                C1C7U.LIZIZ("Editor1VideoLegalChecker@e914.isCanImport$2");
                return null;
            }
        }, C15O7.LJIIIIZZ, null);
    }
}
