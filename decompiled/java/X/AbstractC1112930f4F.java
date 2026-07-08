package X;

import android.os.Looper;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.publicscreen.impl.api.PublicScreenAutoTranslateApi;
import com.bytedance.android.live.publicscreen.impl.api.model.AutoTranslateParams;
import com.bytedance.android.livesdk.chatroom.model.MGetTranslationRequest;
import com.bytedance.android.livesdk.chatroom.model.MGetTranslationResponse;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveAutoTranslateBufferConfigSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveAutoTranslateLanguageConfigSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveAutoTranslateModelAnchorSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveAutoTranslateModelAudienceSetting;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AwS596S0100000_17;

/* JADX INFO: renamed from: X.0f4F, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC1112930f4F<T> extends AbstractC1112980f4K<T> {
    public static final /* synthetic */ int LJIILL = 0;
    public final LifecycleOwner LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final String LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final Looper LJI;
    public final LiveAutoTranslateBufferConfigSetting.LiveTranslateBufferConfig LJII;
    public C1112940f4G<T> LJIIIIZZ;
    public final List<T> LJIIIZ;
    public InterfaceC1112970f4J<T> LJIIJ;
    public C11NJ LJIIJJI;
    public final String LJIIL;
    public final Map<String, List<String>> LJIILIIL;
    public final boolean LJIILJJIL;

    public abstract List LIZLLL(List list, Map map);

    public abstract MGetTranslationRequest.Text LJ(T t);

    public boolean LIZ(T t) {
        if (!this.LJFF) {
            return InterfaceC1106030et7.G5.LIZIZ().booleanValue();
        }
        return InterfaceC1106030et7.J5.LIZIZ().booleanValue();
    }

    public final boolean LIZJ(String str) {
        if (!this.LJIILJJIL) {
            return true;
        }
        List<String> list = this.LJIILIIL.get(str);
        if (list != null) {
            return list.contains(this.LJIIL);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C19476611Hw LJFF(List list) {
        if (list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            MGetTranslationRequest.Text textLJ = LJ(it2.next());
            if (textLJ != null) {
                arrayList.add(textLJ);
            }
        }
        C480460Ism.LIZ().getClass();
        return ((PublicScreenAutoTranslateApi) C480460Ism.LIZLLL(PublicScreenAutoTranslateApi.class)).translate(new AutoTranslateParams(this.LIZIZ, this.LIZJ, this.LIZLLL, (MGetTranslationRequest.Text[]) arrayList.toArray(new MGetTranslationRequest.Text[0]))).LJJJLZIJ(C1701940uOG.LIZIZ()).LJL(C11S5.LIZ());
    }

    public final void LJII(final List<? extends T> list) {
        C11RO c11roLIZIZ;
        C19476611Hw c19476611HwLJFF = LJFF(list);
        if (c19476611HwLJFF == null) {
            return;
        }
        long j = this.LJII.messageAutoTranslateRequestTimeout;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        C19497811Qa c19497811QaLJLJJL = c19476611HwLJFF.LJLJJL(j, new C098D(this) { // from class: X.0f4I
            public final /* synthetic */ AbstractC1112930f4F<T> LLILLJJLI;

            {
                this.LLILLJJLI = this;
            }

            @Override // X.C098D
            public final void LIZIZ(InterfaceC626120Oh8<? super C470590Icr<MGetTranslationResponse.Data>> interfaceC626120Oh8) {
                List<T> list2 = list;
                AbstractC1112930f4F<T> abstractC1112930f4F = this.LLILLJJLI;
                for (T t : list2) {
                    InterfaceC1112970f4J<T> interfaceC1112970f4J = abstractC1112930f4F.LJIIJ;
                    if (interfaceC1112970f4J != null) {
                        interfaceC1112970f4J.LIZIZ(t);
                    }
                }
                this.LLILLJJLI.LIZIZ(2, null);
            }
        }, C1701940uOG.LIZIZ(), timeUnit);
        Looper looper = this.LJI;
        if (looper != null) {
            c11roLIZIZ = C1701940uOG.LIZ(looper);
        } else {
            c11roLIZIZ = C1701940uOG.LIZIZ();
        }
        c19497811QaLJLJJL.LJJJLZIJ(c11roLIZIZ).LIZIZ(new InterfaceC626120Oh8<C470590Icr<MGetTranslationResponse.Data>>(this) { // from class: X.0f4H
            public InterfaceC420801kM LL;
            public final /* synthetic */ AbstractC1112930f4F<T> LLILLJJLI;

            @Override // X.InterfaceC626120Oh8
            public final void onComplete() {
                C11NJ c11nj;
                InterfaceC420801kM interfaceC420801kM = this.LL;
                if (interfaceC420801kM == null || (c11nj = this.LLILLJJLI.LJIIJJI) == null) {
                    return;
                }
                c11nj.LIZJ(interfaceC420801kM);
            }

            @Override // X.InterfaceC626120Oh8
            public final void onError(Throwable th) {
                C11NJ c11nj;
                List<T> list2 = list;
                AbstractC1112930f4F<T> abstractC1112930f4F = this.LLILLJJLI;
                for (Object obj : list2) {
                    InterfaceC1112970f4J<T> interfaceC1112970f4J = abstractC1112930f4F.LJIIJ;
                    if (interfaceC1112970f4J != 0) {
                        interfaceC1112970f4J.LIZJ(obj);
                    }
                }
                this.LLILLJJLI.LIZIZ(3, th);
                InterfaceC420801kM interfaceC420801kM = this.LL;
                if (interfaceC420801kM != null && (c11nj = this.LLILLJJLI.LJIIJJI) != null) {
                    c11nj.LIZJ(interfaceC420801kM);
                }
            }

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
            @Override // X.InterfaceC626120Oh8
            public final void onNext(C470590Icr<MGetTranslationResponse.Data> c470590Icr) {
                Map<String, MGetTranslationResponse.Data.Translation> map;
                AbstractC1112930f4F<T> abstractC1112930f4F = this.LLILLJJLI;
                List<T> list2 = list;
                MGetTranslationResponse.Data data = c470590Icr.data;
                if (data != null && (map = data.translations) != null) {
                    abstractC1112930f4F.LIZLLL(list2, map);
                    for (Object obj : list2) {
                        InterfaceC1112970f4J<T> interfaceC1112970f4J = abstractC1112930f4F.LJIIJ;
                        if (interfaceC1112970f4J != 0) {
                            interfaceC1112970f4J.LIZ(obj);
                        }
                    }
                    abstractC1112930f4F.LIZIZ(1, null);
                    return;
                }
                List<T> list3 = list;
                AbstractC1112930f4F<T> abstractC1112930f4F2 = this.LLILLJJLI;
                for (Object obj2 : list3) {
                    InterfaceC1112970f4J<T> interfaceC1112970f4J2 = abstractC1112930f4F2.LJIIJ;
                    if (interfaceC1112970f4J2 != 0) {
                        interfaceC1112970f4J2.LIZ(obj2);
                    }
                }
                abstractC1112930f4F2.LIZIZ(1, null);
            }

            @Override // X.InterfaceC626120Oh8
            public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
                this.LL = interfaceC420801kM;
                C11NJ c11nj = this.LLILLJJLI.LJIIJJI;
                if (c11nj != null) {
                    c11nj.LIZ(interfaceC420801kM);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.LLILLJJLI = this;
            }
        });
    }

    public final void LIZIZ(int i, Throwable th) {
        InterfaceC1112970f4J<T> interfaceC1112970f4J;
        if (((ArrayList) this.LJIIIZ).isEmpty()) {
            return;
        }
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    for (Object obj : (ArrayList) this.LJIIIZ) {
                        if (th != null && (interfaceC1112970f4J = this.LJIIJ) != null) {
                            interfaceC1112970f4J.LIZJ(obj);
                        }
                    }
                }
            } else {
                for (Object obj2 : (ArrayList) this.LJIIIZ) {
                    InterfaceC1112970f4J<T> interfaceC1112970f4J2 = this.LJIIJ;
                    if (interfaceC1112970f4J2 != null) {
                        interfaceC1112970f4J2.LIZIZ((T) obj2);
                    }
                }
            }
        } else {
            for (Object obj3 : (ArrayList) this.LJIIIZ) {
                InterfaceC1112970f4J<T> interfaceC1112970f4J3 = this.LJIIJ;
                if (interfaceC1112970f4J3 != null) {
                    interfaceC1112970f4J3.LIZ((T) obj3);
                }
            }
        }
        ((ArrayList) this.LJIIIZ).clear();
    }

    public final boolean LJI(T t, InterfaceC1112970f4J<T> interfaceC1112970f4J, boolean z) {
        C1112940f4G<T> c1112940f4G;
        if (!LIZ(t) && !z) {
            return false;
        }
        this.LJIIJ = interfaceC1112970f4J;
        if (this.LJ) {
            if (z && (c1112940f4G = this.LJIIIIZZ) != null && (!c1112940f4G.isEmpty())) {
                ((ArrayList) this.LJIIIZ).add(t);
                return true;
            }
            C1112940f4G<T> c1112940f4G2 = this.LJIIIIZZ;
            if (c1112940f4G2 != null) {
                c1112940f4G2.add(t);
                return true;
            }
        } else {
            LJII(Collections.singletonList(t));
        }
        return true;
    }

    public AbstractC1112930f4F(LifecycleOwner lifecycleOwner, long j, long j2, String str, boolean z, boolean z2, Looper looper) {
        int value;
        this.LIZ = lifecycleOwner;
        this.LIZIZ = j;
        this.LIZJ = j2;
        this.LIZLLL = str;
        this.LJ = z;
        this.LJFF = z2;
        this.LJI = looper;
        LiveAutoTranslateBufferConfigSetting.LiveTranslateBufferConfig value2 = LiveAutoTranslateBufferConfigSetting.getValue();
        this.LJII = value2;
        this.LJIIIZ = new ArrayList();
        this.LJIIJJI = new C11NJ();
        this.LJIIL = C786410Ut5.t2(((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).currentLocale());
        this.LJIILIIL = LiveAutoTranslateLanguageConfigSetting.getValue();
        if (z2) {
            value = LiveAutoTranslateModelAnchorSetting.INSTANCE.getValue();
        } else {
            value = LiveAutoTranslateModelAudienceSetting.INSTANCE.getValue();
        }
        this.LJIILJJIL = value > 1;
        if (z) {
            C1112940f4G<T> c1112940f4G = new C1112940f4G<>(value2.autoTranslateBufferSize, value2.autoTranslateBufferTimeout, looper);
            this.LJIIIIZZ = c1112940f4G;
            c1112940f4G.setCountDownDispose(new AwS596S0100000_17(this, (AbstractC1112930f4F<Object>) 624));
        }
    }
}
