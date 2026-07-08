package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ecommerce.api.model.ButtonAction;
import com.ss.android.ugc.aweme.ecommerce.api.model.DialogButton;
import com.ss.android.ugc.aweme.ecommerce.api.model.FetchInfo;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.03Hd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C817103Hd extends C09AY implements Function1<C1397620mTQ, Unit> {
    public final /* synthetic */ List<DialogButton> LL;
    public final /* synthetic */ C03DB LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;
    public final /* synthetic */ Function1<FetchInfo, Unit> LLILZIL;
    public final /* synthetic */ Function0<Unit> LLILZLL;
    public final /* synthetic */ Function0<Unit> LLIZ;
    public final /* synthetic */ Function1<String, Unit> LLIZLLLIL;
    public final /* synthetic */ Function0<Unit> LLJ;
    public final /* synthetic */ Function0<Unit> LLJI;
    public final /* synthetic */ String LLJIJIL;
    public final /* synthetic */ int LLJILJIL;
    public final /* synthetic */ HashMap<String, Object> LLJILJILJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C817103Hd(List<DialogButton> list, C03DB c03db, Context context, Function0<Unit> function0, Function1<? super FetchInfo, Unit> function1, Function0<Unit> function02, Function0<Unit> function03, Function1<? super String, Unit> function12, Function0<Unit> function04, Function0<Unit> function05, String str, int i, HashMap<String, Object> map) {
        super(1);
        this.LL = list;
        this.LLILLJJLI = c03db;
        this.LLILLL = context;
        this.LLILZ = function0;
        this.LLILZIL = function1;
        this.LLILZLL = function02;
        this.LLIZ = function03;
        this.LLIZLLLIL = function12;
        this.LLJ = function04;
        this.LLJI = function05;
        this.LLJIJIL = str;
        this.LLJILJIL = i;
        this.LLJILJILJ = map;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1397620mTQ c1397620mTQ) {
        Function0<Unit> function0;
        Function1<FetchInfo, Unit> function1;
        Function0<Unit> function02;
        Context context;
        C03DB c03db;
        String str;
        ButtonAction buttonAction;
        C1397620mTQ c1397620mTQ2 = c1397620mTQ;
        C03U3 c03u3 = C03U3.LIZ;
        List<DialogButton> list = this.LL;
        C03DB c03db2 = this.LLILLJJLI;
        Context context2 = this.LLILLL;
        Function0<Unit> function03 = this.LLILZ;
        Function1<FetchInfo, Unit> function12 = this.LLILZIL;
        Function0<Unit> function04 = this.LLILZLL;
        Function0<Unit> function05 = this.LLIZ;
        Function1<String, Unit> function13 = this.LLIZLLLIL;
        Function0<Unit> function06 = this.LLJ;
        Function0<Unit> function07 = this.LLJI;
        String str2 = this.LLJIJIL;
        int i = this.LLJILJIL;
        HashMap<String, Object> map = this.LLJILJILJ;
        c03u3.getClass();
        String str3 = "";
        if (C13LP.LJJJLL(list) != null) {
            DialogButton dialogButton = (DialogButton) C13LP.LJJJLL(list);
            if (dialogButton == null || (str = dialogButton.text) == null) {
                str = "";
            }
            DialogButton dialogButton2 = (DialogButton) C13LP.LJJJLL(list);
            if (dialogButton2 != null) {
                buttonAction = dialogButton2.buttonAction;
            } else {
                buttonAction = null;
            }
            function0 = function04;
            function1 = function12;
            function02 = function03;
            context = context2;
            c03db = c03db2;
            function13 = function13;
            function05 = function05;
            c1397620mTQ2.LIZJ(0, str, new C03JL(c03db2, context2, buttonAction, function03, function12, function04, function05, function13, function06, function07, str2, map, null, null, null, null, 28672));
        } else {
            function0 = function04;
            function1 = function12;
            function02 = function03;
            context = context2;
            c03db = c03db2;
        }
        if (list.size() > 1 && C13LP.LJJJLZIJ(1, list) != null) {
            String str4 = ((DialogButton) ListProtector.get(list, 1)).text;
            if (str4 == null) {
                str4 = "";
            }
            C03U3.LIZ(c1397620mTQ2, str4, 1, new C03JL(c03db, context, ((DialogButton) ListProtector.get(list, 1)).buttonAction, function02, function1, function0, function05, function13, function06, function07, str2, map, null, null, null, null, 28672));
        }
        if (list.size() > 2 && C13LP.LJJJLZIJ(2, list) != null) {
            String str5 = ((DialogButton) ListProtector.get(list, 2)).text;
            if (str5 != null) {
                str3 = str5;
            }
            C03U3.LIZ(c1397620mTQ2, str3, 2, new C03JL(c03db, context, ((DialogButton) ListProtector.get(list, 2)).buttonAction, function02, function1, function0, function05, function13, function06, function07, str2, map, null, null, null, null, 28672));
        }
        if (i == 1) {
            c1397620mTQ2.LJFF = true;
        }
        return Unit.LIZ;
    }
}
