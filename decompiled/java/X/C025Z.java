package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.025Z, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C025Z extends Message<C025Z, C02IC> {
    public static final ProtoAdapter<C025Z> ADAPTER = new ProtoAdapter<C025Z>() { // from class: X.022f
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C025Z decode(ProtoReader protoReader) {
            C025Z c025z = new C025Z();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 6) {
                                    if (iNextTag != 7) {
                                        if (iNextTag != 100) {
                                            switch (iNextTag) {
                                                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                                                    c025z.request_order = ProtoAdapter.INT64.decode(protoReader);
                                                    break;
                                                case BdTuring.TYPE_EMAIL /* 11 */:
                                                    c025z.sug_virtual_enable = ProtoAdapter.STRING.decode(protoReader);
                                                    break;
                                                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                                                    c025z.config = C623202bu.ADAPTER.decode(protoReader);
                                                    break;
                                                case BdTuring.TYPE_SMS_VOICE /* 13 */:
                                                    c025z.original_query = ProtoAdapter.STRING.decode(protoReader);
                                                    break;
                                                default:
                                                    protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                                    break;
                                            }
                                        } else {
                                            c025z.result_status = ProtoAdapter.INT32.decode(protoReader);
                                        }
                                    } else {
                                        c025z.log_pb = C676102kR.ADAPTER.decode(protoReader);
                                    }
                                } else {
                                    c025z.extra = C684902lr.ADAPTER.decode(protoReader);
                                }
                            } else {
                                c025z.status_msg = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c025z.status_code = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c025z.sug_list.add(AnonymousClass0280.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c025z;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C025Z c025z) {
            C025Z c025z2 = c025z;
            int iEncodedSizeWithTag = AnonymousClass0280.ADAPTER.asRepeated().encodedSizeWithTag(1, c025z2.sug_list);
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c025z2.status_code);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            return iEncodedSizeWithTag2 + protoAdapter2.encodedSizeWithTag(3, c025z2.status_msg) + C684902lr.ADAPTER.encodedSizeWithTag(6, c025z2.extra) + C676102kR.ADAPTER.encodedSizeWithTag(7, c025z2.log_pb) + ProtoAdapter.INT64.encodedSizeWithTag(10, c025z2.request_order) + protoAdapter2.encodedSizeWithTag(11, c025z2.sug_virtual_enable) + C623202bu.ADAPTER.encodedSizeWithTag(12, c025z2.config) + protoAdapter2.encodedSizeWithTag(13, c025z2.original_query) + protoAdapter.encodedSizeWithTag(100, c025z2.result_status) + c025z2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C025Z c025z) {
            C025Z c025z2 = c025z;
            AnonymousClass0280.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, c025z2.sug_list);
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 2, c025z2.status_code);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            protoAdapter2.encodeWithTag(protoWriter, 3, c025z2.status_msg);
            C684902lr.ADAPTER.encodeWithTag(protoWriter, 6, c025z2.extra);
            C676102kR.ADAPTER.encodeWithTag(protoWriter, 7, c025z2.log_pb);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 10, c025z2.request_order);
            protoAdapter2.encodeWithTag(protoWriter, 11, c025z2.sug_virtual_enable);
            C623202bu.ADAPTER.encodeWithTag(protoWriter, 12, c025z2.config);
            protoAdapter2.encodeWithTag(protoWriter, 13, c025z2.original_query);
            protoAdapter.encodeWithTag(protoWriter, 100, c025z2.result_status);
            protoWriter.writeBytes(c025z2.unknownFields());
        }
    };
    public C623202bu config;
    public C684902lr extra;
    public C676102kR log_pb;
    public String original_query;
    public Long request_order;
    public Integer result_status;
    public Integer status_code;
    public String status_msg;
    public List<AnonymousClass0280> sug_list;
    public String sug_virtual_enable;

    public C025Z() {
        super(ADAPTER, ByteString.EMPTY);
        this.sug_list = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02IC newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
