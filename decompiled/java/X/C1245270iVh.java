package X;

import android.content.Intent;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.profile.business.profile.background.CommitUserBgResponse;
import com.ss.android.ugc.profile.business.profile.background.ProfileBgVideoPreviewActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0iVh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.profile.background.ProfileBgVideoPreviewActivity$onSaveClicked$1", f = "ProfileBgVideoPreviewActivity.kt", l = {650}, m = "invokeSuspend")
public final class C1245270iVh extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ ProfileBgVideoPreviewActivity LLILLJJLI;
    public final /* synthetic */ float LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1245270iVh(ProfileBgVideoPreviewActivity profileBgVideoPreviewActivity, float f, InterfaceC1364105Vn<? super C1245270iVh> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = profileBgVideoPreviewActivity;
        this.LLILLL = f;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1245270iVh(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean z;
        C1C7U.LIZ("ProfileBgVideoPreviewActivity@7f12.onSaveClicked$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        Integer numLJ = null;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C1DFB c1dfb = C0PEM.LIZJ;
            C1245280iVi c1245280iVi = new C1245280iVi(this.LLILLJJLI, this.LLILLL, null);
            this.LL = 1;
            obj = C23250099c.LJI(this, c1dfb, c1245280iVi);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ProfileBgVideoPreviewActivity@7f12.onSaveClicked$1");
                return objLJFF;
            }
        }
        CommitUserBgResponse commitUserBgResponse = (CommitUserBgResponse) obj;
        C1390410mHn c1390410mHn = this.LLILLJJLI.LLJJIII;
        if (c1390410mHn != null) {
            c1390410mHn.LIZLLL();
        }
        View view = this.LLILLJJLI.LLJJI;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        boolean z2 = false;
        this.LLILLJJLI.LLJJIJIIJIL = false;
        if (commitUserBgResponse != null && commitUserBgResponse.status_code == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z || (commitUserBgResponse != null && commitUserBgResponse.user != null)) {
            int i2 = C2187451AjH.LIZ;
            C1720106oR.LJI("ProfileBackground", "Preview: commit background success");
            C1250680ieQ.LJIL(C1250680ieQ.LIZ, "video", "success");
            ProfileBgVideoPreviewActivity profileBgVideoPreviewActivity = this.LLILLJJLI;
            float f = this.LLILLL;
            C1390410mHn c1390410mHn2 = profileBgVideoPreviewActivity.LLJJIII;
            if (c1390410mHn2 != null) {
                c1390410mHn2.LIZLLL();
            }
            View view2 = profileBgVideoPreviewActivity.LLJJI;
            if (view2 != null) {
                C786410Ut5.LJLLLLLL(8, view2);
            }
            profileBgVideoPreviewActivity.LLJJIJIIJIL = false;
            String str = profileBgVideoPreviewActivity.LLJL;
            Aweme aweme = C1245100iVQ.LIZIZ;
            if (aweme != null && Intrinsics.LJFF(aweme.getAid(), str)) {
                C1245100iVQ.LIZ.put(str, aweme);
                C1245100iVQ.LIZIZ = null;
                z2 = true;
            }
            C1720106oR.LJI("ProfileBackground", "Preview: committed aweme cache success=" + z2 + ", awemeId=" + profileBgVideoPreviewActivity.LLJL + " offsetRatio=" + f);
            if (!z2) {
                C1389890mGx c1389890mGx = new C1389890mGx(profileBgVideoPreviewActivity);
                c1389890mGx.LJIIJ(profileBgVideoPreviewActivity.getString(2131845382));
                c1389890mGx.LJIIJJI();
            } else {
                C1720106oR.LJI("ProfileBackground", "Preview: setResult RESULT_OK awemeId=" + profileBgVideoPreviewActivity.LLJL + " offsetRatio=" + f + " bgUpdated=true");
                Intent intent = new Intent();
                intent.putExtra("extra_bg_updated", true);
                intent.putExtra("extra_bg_aweme_id", profileBgVideoPreviewActivity.LLJL);
                intent.putExtra("extra_bg_offset_ratio", f);
                C2204961BRm.S(profileBgVideoPreviewActivity, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2grc2E6au/mYYrd1TyhAn5vpjsCmOQvxKkBRrqLwSJLa+uAZs9Z/Y3ig7uX5mXjpWgHR1DsFsl9Ipy2zemiqTix", null));
                profileBgVideoPreviewActivity.finish();
            }
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Preview: commit background failed, statusCode=");
            if (commitUserBgResponse != null) {
                numLJ = C2286608xc.LJ(commitUserBgResponse.status_code);
            }
            sbLIZ.append(numLJ);
            C1720106oR.LIZ("ProfileBackground", C2188811AlT.LIZIZ(sbLIZ));
            C1250680ieQ.LJIL(C1250680ieQ.LIZ, "video", "fail");
            C1389890mGx c1389890mGx2 = new C1389890mGx(this.LLILLJJLI);
            c1389890mGx2.LJIIJ(this.LLILLJJLI.getString(2131845382));
            c1389890mGx2.LJIIJJI();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ProfileBgVideoPreviewActivity@7f12.onSaveClicked$1");
        return unit;
    }
}
