package X;

import android.content.Context;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0SJu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C719400SJu implements C0SJV {
    public final /* synthetic */ C720690SOt LIZ;
    public final /* synthetic */ Aweme LIZIZ;
    public final /* synthetic */ Context LIZJ;
    public final /* synthetic */ int LIZLLL;

    @Override // X.C0SJV
    public final void LIZ(C0SJL<C719000SIg> c0sjl) {
        TextExtraStruct textExtraStruct;
        float f;
        boolean z;
        C720690SOt c720690SOt = this.LIZ;
        Context context = this.LIZJ;
        int i = this.LIZLLL;
        c720690SOt.getClass();
        C719000SIg c719000SIg = c0sjl.LLIZ;
        if (c719000SIg != null && (textExtraStruct = c719000SIg.LIZ) != null) {
            int iLIZ = C960203pA.LIZ(R.attr.br, context);
            if (C722510SVt.LIZJ()) {
                z = true;
                f = 15.0f;
                iLIZ = 0;
            } else {
                f = 13.0f;
                z = false;
            }
            C428830Grh c428830Grh = new C428830Grh(context, C814420VxA.LIZIZ(C12ES.LJIIJ(context)), iLIZ, i, textExtraStruct, true, null, true, z, null, 1600);
            float fLIZJ = C12ES.LIZJ(12.0f, context);
            if (C722510SVt.LIZJ()) {
                fLIZJ = C12ES.LIZJ(8.0f, context);
            }
            c428830Grh.LLJILLL = fLIZJ;
            c428830Grh.LLJJ = C12ES.LIZJ(2.0f, context);
            c428830Grh.LLJILJIL = C12ES.LIZJ(f, context);
            c0sjl.LLIZLLLIL.add(c428830Grh);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("addTypeAtMatcher: start:");
            sbLIZ.append(textExtraStruct.getStart());
            sbLIZ.append(", end: ");
            sbLIZ.append(textExtraStruct.getEnd());
            C719300SJk.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    @Override // X.C0SJV
    public final boolean LIZIZ(C0SJL<C719000SIg> c0sjl) {
        C720690SOt c720690SOt = this.LIZ;
        C719000SIg c719000SIg = c0sjl.LLIZ;
        Aweme aweme = this.LIZIZ;
        c720690SOt.getClass();
        if (c719000SIg == null) {
            return false;
        }
        TextExtraStruct textExtraStruct = c719000SIg.LIZ;
        if ((textExtraStruct.getType() != 0 || ((TextUtils.isEmpty(textExtraStruct.getAwemeId()) && 2 != textExtraStruct.getSubtype()) || AwemeExtKt.getFoldedHashTagDesc(aweme).charAt(textExtraStruct.getStart()) != '@')) && !C11VF.LIZIZ.LJ(textExtraStruct)) {
            return false;
        }
        return true;
    }

    public C719400SJu(C720690SOt c720690SOt, Aweme aweme, Context context, int i) {
        this.LIZ = c720690SOt;
        this.LIZIZ = aweme;
        this.LIZJ = context;
        this.LIZLLL = i;
    }
}
