package X;

import android.content.ContentValues;
import android.text.TextUtils;
import com.bytedance.im.core.proto.ModifyMessagePropertyRequestBody;
import com.bytedance.im.core.proto.ModifyMessagePropertyResponseBody;
import com.bytedance.im.core.proto.ModifyPropertyBody;
import com.bytedance.im.core.proto.ModifyPropertyContent;
import com.bytedance.im.core.proto.Response;
import com.bytedance.im.core.proto.ResponseBody;
import com.bytedance.im.core.proto.UrlStruct;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.0YA4, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YA4 extends AbstractC867440Y1e<C0YA6> {
    @Override // X.AbstractC867440Y1e
    public final boolean LJ() {
        return true;
    }

    public C0YA4(C0YEM c0yem) {
        super(c0yem, C0YMR.SET_MESSAGE_PROPERTY.getValue(), null);
    }

    @Override // X.AbstractC867440Y1e
    public final boolean LJIIIIZZ(C0YIN c0yin) {
        Response response;
        ResponseBody responseBody;
        ModifyMessagePropertyResponseBody modifyMessagePropertyResponseBody;
        if (c0yin == null || !c0yin.LJIIJJI() || (response = c0yin.LLIZ) == null || (responseBody = response.body) == null || (modifyMessagePropertyResponseBody = responseBody.modify_message_property_body) == null) {
            return false;
        }
        C0YAO c0yao = modifyMessagePropertyResponseBody.status;
        if (c0yao != C0YAO.MODIFY_PROPERTY_SUCCESS && c0yao != C0YAO.MODIFY_PROPERTY_REPEAT_REQUEST) {
            return false;
        }
        return true;
    }

    public final List<C0YA1> LJIIJJI(C0YA6 c0ya6) {
        List<C0YAQ> localPropertyContentList;
        if (c0ya6 == null || (localPropertyContentList = c0ya6.getLocalPropertyContentList()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (C0YAQ c0yaq : localPropertyContentList) {
            ModifyPropertyContent modifyPropertyContent = c0yaq.LIZ;
            C0YA1 c0ya1 = new C0YA1();
            c0ya1.msgUuid = c0ya6.getClientMessageId();
            c0ya1.conversationId = c0ya6.getConversationId();
            c0ya1.uid = Long.valueOf(this.LIZJ.getUid());
            c0ya1.sec_uid = this.LIZJ.LJ().LJ().getSecUid();
            c0ya1.idempotent_id = modifyPropertyContent.idempotent_id;
            c0ya1.key = modifyPropertyContent.key;
            c0ya1.value = modifyPropertyContent.value;
            c0ya1.status = 1;
            c0ya1.url = c0yaq.LIZIZ;
            c0ya1.createTimeMicros = System.currentTimeMillis() * 1000;
            if (modifyPropertyContent.operation.getValue() == C0YS6.ADD_PROPERTY_ITEM.getValue()) {
                c0ya1.deleted = 0;
            } else if (modifyPropertyContent.operation.getValue() == C0YS6.REMOVE_PROPERTY_ITEM.getValue()) {
                c0ya1.deleted = 1;
            }
            c0ya1.setBizExtra(modifyPropertyContent.biz_extra);
            arrayList.add(c0ya1);
        }
        return arrayList;
    }

    public C0YA4(C0YEM c0yem, C914090ZtX c914090ZtX) {
        super(c0yem, C0YMR.SET_MESSAGE_PROPERTY.getValue(), c914090ZtX);
    }

    @Override // X.AbstractC867440Y1e
    public final void LJII(final C0YIN c0yin, C0Y1G c0y1g) {
        final C0YA6 c0ya6;
        Object[] objArr = c0yin.LLILZIL;
        if (objArr == null || (c0ya6 = (C0YA6) objArr[0]) == null) {
            return;
        }
        final boolean zLJIIIIZZ = LJIIIIZZ(c0yin);
        this.LIZJ.LJIIJJI().LIZJ(new InterfaceC872410YKh<C0YA6>() { // from class: X.0YA3
            /* JADX WARN: Removed duplicated region for block: B:46:0x0122 A[PHI: r1
              0x0122: PHI (r1v1 X.0YAO) = (r1v0 X.0YAO), (r1v0 X.0YAO), (r1v0 X.0YAO), (r1v11 X.0YAO) binds: [B:3:0x0008, B:5:0x000c, B:7:0x0010, B:9:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // X.InterfaceC872410YKh
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final X.C0YA6 LIZ() throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 341
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C0YA3.LIZ():java.lang.Object");
            }
        }, new InterfaceC864800XwE<C0YA6>() { // from class: X.0YA5
            /* JADX WARN: Removed duplicated region for block: B:24:0x006f  */
            @Override // X.InterfaceC864800XwE
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(X.C0YA6 r9) {
                /*
                    Method dump skipped, instruction units count: 290
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C0YA5.LIZ(java.lang.Object):void");
            }
        }, false, this.LIZJ.LJIIL().LIZLLL());
    }

    public final void LJIILIIL(Collection<C0YA6> collection, boolean z) {
        C0YJ9 c0yj9 = new C0YJ9(this.LIZJ);
        c0yj9.LIZJ("im_resend_msg_property");
        c0yj9.LIZ(Integer.valueOf(collection.size()), "property_count");
        c0yj9.LIZ(Boolean.valueOf(z), "property_for_single_message");
        c0yj9.LIZLLL();
    }

    public final void LJIILJJIL(final C0Y3I c0y3i, final C0YA6 c0ya6) {
        if (c0ya6 != null && !c0ya6.invalid()) {
            c0ya6.setMsgType(EnumC868450Y5b.MESSAGE_TYPE_UPDATE_MESSAGE_PROPERTY.getValue());
            this.LIZJ.LJIIJJI().LIZJ(new InterfaceC872410YKh<Boolean>() { // from class: X.0YA2
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:75:? -> B:43:0x019e). Please report as a decompilation issue!!! */
                @Override // X.InterfaceC872410YKh
                public final Boolean LIZ() throws Throwable {
                    List<ModifyPropertyContent> propertyContentList;
                    C869590Y9l c869590Y9lLJJJI;
                    InterfaceC869960YAw interfaceC869960YAwLIZ;
                    List<C0YA1> listLJIIJJI = this.LIZJ.LJIIJJI(c0ya6);
                    if (listLJIIJJI == null) {
                        return Boolean.FALSE;
                    }
                    int i = c0ya6.getServerMessageId() == 0 ? 5 : 1;
                    C869660Y9s c869660Y9sLJIIJ = this.LIZJ.LIZLLL.LJIIJ();
                    c869660Y9sLJIIJ.LIZJ.getProxy().LJIILIIL("IMMsgPropertyDao.updateProperty");
                    ArrayList<C0YA1> arrayList = (ArrayList) listLJIIJJI;
                    for (C0YA1 c0ya1 : arrayList) {
                        if (c0ya1 != null && !TextUtils.isEmpty(c0ya1.msgUuid)) {
                            C868780Y6i c868780Y6iLIZLLL = c869660Y9sLJIIJ.LIZ.LIZLLL();
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("IMMsgPropertyDao updateProperty status: ");
                            sbLIZ.append(i);
                            c868780Y6iLIZLLL.LJFF(C2188811AlT.LIZIZ(sbLIZ));
                            c0ya1.status = i;
                            C0YA1 c0ya1LJII = c869660Y9sLJIIJ.LJII(c0ya1.msgUuid, c0ya1.key, c0ya1.idempotent_id);
                            if (c0ya1LJII == null) {
                                try {
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append("insert or ignore into msg_property_new values(");
                                    C869650Y9r c869650Y9rLIZ = c869660Y9sLJIIJ.LIZJ.LIZ();
                                    int length = EnumC869700Y9w.values().length;
                                    c869650Y9rLIZ.getClass();
                                    sbLIZ2.append(C869650Y9r.LJ(length));
                                    sbLIZ2.append(")");
                                    interfaceC869960YAwLIZ = c869660Y9sLJIIJ.LIZJ.getProxy().LIZ(C2188811AlT.LIZIZ(sbLIZ2));
                                    try {
                                        try {
                                            C869660Y9s.LIZ(interfaceC869960YAwLIZ, c0ya1);
                                            if (interfaceC869960YAwLIZ != null) {
                                                interfaceC869960YAwLIZ.LJIL();
                                            }
                                        } catch (Exception e) {
                                            e = e;
                                            TryCatchGuardChecker.doCheck(e);
                                            C868780Y6i c868780Y6iLIZLLL2 = c869660Y9sLJIIJ.LIZ.LIZLLL();
                                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                            sbLIZ3.append("IMMsgPropertyDao updateProperty status: ");
                                            sbLIZ3.append(i);
                                            c868780Y6iLIZLLL2.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ3), e);
                                            c869660Y9sLJIIJ.LIZIZ.LJFF().getEventTracker().LJ(e);
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        TryCatchGuardChecker.doCheck(th);
                                        c869660Y9sLJIIJ.LIZJ.LIZ().LIZIZ(interfaceC869960YAwLIZ);
                                        throw th;
                                    }
                                } catch (Exception e2) {
                                    e = e2;
                                    interfaceC869960YAwLIZ = null;
                                } catch (Throwable th2) {
                                    th = th2;
                                    interfaceC869960YAwLIZ = null;
                                    TryCatchGuardChecker.doCheck(th);
                                    c869660Y9sLJIIJ.LIZJ.LIZ().LIZIZ(interfaceC869960YAwLIZ);
                                    throw th;
                                }
                            } else {
                                int i2 = c0ya1LJII.status;
                                if (i2 == 1 || i2 == 4) {
                                    c0ya1.status = 4;
                                }
                                ContentValues contentValues = new ContentValues();
                                contentValues.put(EnumC869700Y9w.COLUMN_SENDER.key, c0ya1.uid);
                                contentValues.put(EnumC869700Y9w.COLUMN_SENDER_SEC.key, c0ya1.sec_uid);
                                contentValues.put(EnumC869700Y9w.COLUMN_VALUE.key, c0ya1.value);
                                contentValues.put(EnumC869700Y9w.COLUMN_DELETED.key, Integer.valueOf(c0ya1.deleted));
                                contentValues.put(EnumC869700Y9w.COLUMN_VERSION.key, Long.valueOf(c0ya1.version));
                                contentValues.put(EnumC869700Y9w.COLUMN_STATUS.key, Integer.valueOf(c0ya1.status));
                                contentValues.put(EnumC869700Y9w.COLUMN_CREATE_TIME.key, Long.valueOf(c0ya1.getCreateTimeSeconds()));
                                contentValues.put(EnumC869700Y9w.COLUMN_CREATE_TIME_V2.key, Long.valueOf(c0ya1.createTimeMicros));
                                UrlStruct urlStruct = c0ya1.url;
                                if (urlStruct != null) {
                                    contentValues.put(EnumC869700Y9w.COLUMN_URL.key, C09EF.LIZ.LJIILL(urlStruct));
                                }
                                String str = EnumC869700Y9w.COLUMN_BIZ_EXTRA.key;
                                ByteString bizExtra = c0ya1.getBizExtra();
                                if (bizExtra == null) {
                                    bizExtra = ByteString.EMPTY;
                                }
                                contentValues.put(str, bizExtra.toByteArray());
                                c869660Y9sLJIIJ.LIZJ.getProxy().LJIILJJIL("msg_property_new", contentValues, C869660Y9s.LJIIIIZZ(), new String[]{c0ya1.msgUuid, c0ya1.key, c0ya1.idempotent_id});
                                interfaceC869960YAwLIZ = null;
                            }
                            c869660Y9sLJIIJ.LIZJ.LIZ().LIZIZ(interfaceC869960YAwLIZ);
                        }
                    }
                    c869660Y9sLJIIJ.LIZJ.getProxy().LIZJ("IMMsgPropertyDao.updateProperty", true);
                    this.LIZJ.LIZLLL.LJI().LJLL(c0ya6.getClientMessageId());
                    if (!c0ya6.getMute() && (c869590Y9lLJJJI = this.LIZJ.LIZLLL.LJI().LJJJI(c0ya6.getClientMessageId())) != null) {
                        c869590Y9lLJJJI.addLocalExt("s:modify_msg_property_refresh", "true");
                        List<C869590Y9l> listSingletonList = Collections.singletonList(c869590Y9lLJJJI);
                        C868200Y4c c868200Y4c = this.LIZJ.LIZJ.LJIIZILJ().getDomain().LIZ;
                        C0Y3I c0y3i2 = c0y3i;
                        c0y3i2.getClass();
                        c868200Y4c.LJJIIJZLJL(c0y3i2, listSingletonList);
                    }
                    if (i == 1) {
                        C0YA4 c0ya4 = this.LIZJ;
                        C0YA6 c0ya62 = c0ya6;
                        c0ya4.getClass();
                        if (c0ya62 != null && (propertyContentList = c0ya62.getPropertyContentList()) != null && !propertyContentList.isEmpty()) {
                            C0YAH c0yah = new C0YAH();
                            c0yah.LIZLLL = c0ya62.getConversationId();
                            c0yah.LJ = Integer.valueOf(c0ya62.getConversationType());
                            c0yah.LJFF = Long.valueOf(c0ya62.getConversationShortId());
                            c0yah.LJI = Long.valueOf(c0ya62.getServerMessageId());
                            c0yah.LJII = c0ya62.getClientMessageId();
                            C1516540pZE.LIZ(propertyContentList);
                            c0yah.LJIIIIZZ = propertyContentList;
                            ModifyPropertyBody modifyPropertyBodyBuild = c0yah.build();
                            C0YC4 c0yc4 = new C0YC4();
                            c0yc4.LIZLLL = modifyPropertyBodyBuild;
                            ModifyMessagePropertyRequestBody modifyMessagePropertyRequestBodyBuild = c0yc4.build();
                            C1ES0 c1es0 = new C1ES0();
                            c1es0.LJJIL = modifyMessagePropertyRequestBodyBuild;
                            c0ya4.LJIIIZ(c0ya62.getInboxType(), c1es0.build(), null, c0ya62);
                        }
                    } else {
                        C0YJ9 c0yj9 = new C0YJ9(this.LIZJ.LIZJ);
                        c0yj9.LIZJ("im_send_msg_property");
                        c0yj9.LIZ("skipped", FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
                        c0yj9.LIZ(c0ya6.isResend() ? "1" : CardStruct.IStatusCode.DEFAULT, "is_resend");
                        c0yj9.LJFF();
                    }
                    C0YA4 c0ya42 = this.LIZJ;
                    C0YA6 c0ya63 = c0ya6;
                    c0ya42.getClass();
                    for (C0YA1 c0ya12 : arrayList) {
                        if (c0ya12.status == 4) {
                            c0ya63.removePropertyContent(c0ya12);
                        }
                    }
                    return Boolean.TRUE;
                }
            }, null, false, this.LIZJ.LJIIL().LIZJ());
            return;
        }
        LJIIL(c0y3i, -1015, c0ya6);
    }

    public final void LJIIL(C0Y3I c0y3i, int i, C0YA6 c0ya6) {
        if (c0ya6 != null && c0ya6.getMute()) {
            return;
        }
        LIZ(C0YIN.LJFF(this.LIZJ, i));
        C868200Y4c c868200Y4c = this.LIZJ.LJIIZILJ().getDomain().LIZ;
        c868200Y4c.getClass();
        if (c0ya6 != null && !TextUtils.isEmpty(c0ya6.getConversationId())) {
            c868200Y4c.LJIIZILJ(c0ya6.getConversationId(), new C0Y6O(c0y3i, i, c0ya6));
        }
    }
}
