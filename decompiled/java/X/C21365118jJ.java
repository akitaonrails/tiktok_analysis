package X;

import Y.AObserverS234S0100000_32;
import android.text.TextUtils;
import android.util.SparseArray;
import android.widget.EditText;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.sticker.types.ar.text.ARTextResultModule;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.18jJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21365118jJ {
    public final SparseArray<C21365218jK> LIZ;
    public final InterfaceC1624480sNK LIZIZ;
    public C21366118jT LIZJ;
    public C21366118jT LIZLLL;
    public final Function1<Effect, Boolean> LJ;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void LIZ(C21366118jT c21366118jT) {
        C21359318iN c21359318iN;
        boolean zLJI;
        C21359318iN c21359318iN2;
        C21365218jK c21365218jK = this.LIZ.get(c21366118jT.LIZJ);
        int i = c21366118jT.LIZ;
        if (i == 32) {
            Function1<Effect, Boolean> function1 = this.LJ;
            if (function1 != null) {
                zLJI = function1.invoke(this.LIZIZ.LJII().LJIJJLI().getValue()).booleanValue();
            } else {
                zLJI = C1624570sNT.LJI((Effect) this.LIZIZ.LJII().LJIJJLI().getValue());
            }
            if (!zLJI || c21365218jK == null) {
                return;
            }
            c21365218jK.LIZLLL = this.LIZJ;
            c21365218jK.LIZLLL(c21366118jT.LIZIZ, c21366118jT.LIZLLL);
            c21365218jK.LJI = true;
            C21359318iN c21359318iN3 = c21365218jK.LIZ;
            if (c21359318iN3 != null) {
                c21365218jK.LJII = -1;
                c21359318iN3.LLIZLLLIL = -1;
                EditText editText = c21359318iN3.LL;
                if (editText != null && c21359318iN3.LLILZIL != null) {
                    editText.requestFocus();
                    c21359318iN3.LLILZIL.showSoftInput(c21359318iN3.LL, 0);
                }
            }
            String str = c21366118jT.LIZLLL;
            int i2 = c21366118jT.LIZIZ;
            if (!TextUtils.isEmpty(str) && (c21359318iN2 = c21365218jK.LIZ) != null) {
                if (i2 == 1) {
                    c21359318iN2.setHintText(str);
                    return;
                } else {
                    c21359318iN2.setText(str);
                    return;
                }
            }
            return;
        }
        if (i == 33 && (c21359318iN = c21365218jK.LIZ) != null) {
            c21359318iN.LIZ();
        }
    }

    public C21365118jJ(InterfaceC1624480sNK interfaceC1624480sNK, SparseArray<C21365218jK> sparseArray, C19EG c19eg, Function1<Effect, Boolean> function1, Scene scene) {
        ViewModelProvider viewModelProviderOf;
        LifecycleOwner lifecycleOwner;
        this.LIZIZ = interfaceC1624480sNK;
        if (c19eg == null) {
            return;
        }
        this.LIZ = sparseArray;
        this.LJ = function1;
        if (scene != null) {
            viewModelProviderOf = C1659630tI1.LJFF(scene);
            lifecycleOwner = scene;
        } else {
            viewModelProviderOf = ViewModelProviders.of(c19eg);
            lifecycleOwner = c19eg;
        }
        ARTextResultModule aRTextResultModule = (ARTextResultModule) viewModelProviderOf.get(ARTextResultModule.class);
        if (aRTextResultModule.LL == null) {
            aRTextResultModule.LL = new MutableLiveData<>();
        }
        aRTextResultModule.LL.observe(lifecycleOwner, new AObserverS234S0100000_32(this, 36));
        ARTextResultModule aRTextResultModule2 = (ARTextResultModule) viewModelProviderOf.get(ARTextResultModule.class);
        if (aRTextResultModule2.LLILLJJLI == null) {
            aRTextResultModule2.LLILLJJLI = new MutableLiveData<>();
        }
        aRTextResultModule2.LLILLJJLI.observe(lifecycleOwner, new AObserverS234S0100000_32(this, 37));
    }
}
