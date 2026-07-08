package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.story.BackgroundModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS382S0200000_16;
import kotlin.jvm.internal.AwS46S0600000_29;
import njp.a;

/* JADX INFO: renamed from: X.0nkQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.utils.StoryNoteCoverGenerator$createAvatarThoughtDraftCoverBitmap$4", f = "StoryNoteCoverGenerator.kt", l = {206}, m = "invokeSuspend")
public final class C1446600nkQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Bitmap>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ Context LLILZ;
    public final /* synthetic */ User LLILZIL;
    public final /* synthetic */ C817600W5m LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1446600nkQ(Context context, User user, C817600W5m c817600W5m, InterfaceC1364105Vn<? super C1446600nkQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = context;
        this.LLILZIL = user;
        this.LLILZLL = c817600W5m;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1446600nkQ c1446600nkQ = new C1446600nkQ(this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c1446600nkQ.LLILLL = obj;
        return c1446600nkQ;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object objLIZ = obj;
        C1C7U.LIZ("StoryNoteCoverGenerator@8d3e.createAvatarThoughtDraftCoverBitmap$4");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLIZ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLIZ);
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLL;
            Context context = this.LLILZ;
            User user = this.LLILZIL;
            C817600W5m c817600W5m = this.LLILZLL;
            this.LLILLL = interfaceC497601wk;
            this.LL = context;
            this.LLILLJJLI = 1;
            C23260099m c23260099m = new C23260099m(C099M.LIZLLL(this));
            AwS382S0200000_16 awS382S0200000_16 = new AwS382S0200000_16(interfaceC497601wk, c23260099m, 110);
            View viewLJLLJ = C786410Ut5.LJLLJ(context, R.layout.fdq, null);
            C12BX c12bx = (C12BX) viewLJLLJ.findViewById(R.id.w9l);
            ImageView imageView = (ImageView) viewLJLLJ.findViewById(R.id.bkz);
            C20584815gk c20584815gk = (C20584815gk) viewLJLLJ.findViewById(R.id.w9m);
            c20584815gk.setBubbleStyle(EnumC1257160ios.NORMAL);
            c20584815gk.setMaxWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(262.0f))));
            String str = c817600W5m.text;
            C20583115gT.LIZ.getClass();
            c20584815gk.LJIJJ(str, C20583115gT.LIZIZ(str, null));
            c20584815gk.setMentionText(c817600W5m.textExtras);
            c20584815gk.setThoughtData(null);
            c20584815gk.setEnterFrom(null);
            c20584815gk.setEnableDarkMode(false);
            c20584815gk.setEnableSmallScreen(false);
            viewLJLLJ.measure(View.MeasureSpec.makeMeasureSpec(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(393.0f))), 1073741824), View.MeasureSpec.makeMeasureSpec(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(687.0f))), 1073741824));
            viewLJLLJ.layout(0, 0, viewLJLLJ.getMeasuredWidth(), viewLJLLJ.getMeasuredHeight());
            List listLIZ = C20583115gT.LIZ();
            int i2 = c817600W5m.backgroundIndex;
            if (i2 >= 0 && i2 < listLIZ.size()) {
                obj2 = ListProtector.get(listLIZ, i2);
            } else {
                obj2 = (BackgroundModel) C13LP.LJJJJZI(listLIZ);
            }
            C11GZ c11gz = C11GZ.LIZ;
            AwS46S0600000_29 awS46S0600000_29 = new AwS46S0600000_29(c817600W5m, user, c12bx, viewLJLLJ, awS382S0200000_16, imageView, 1);
            c11gz.getClass();
            C11GZ.LIZIZ(user, (BackgroundModel) obj2, awS46S0600000_29);
            objLIZ = c23260099m.LIZ();
            if (objLIZ == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (objLIZ == objLJFF) {
                C1C7U.LIZIZ("StoryNoteCoverGenerator@8d3e.createAvatarThoughtDraftCoverBitmap$4");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("StoryNoteCoverGenerator@8d3e.createAvatarThoughtDraftCoverBitmap$4");
        return objLIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Bitmap> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
