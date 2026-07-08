package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02DZ, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02DZ extends Message<C02DZ, C586002Qg> {
    public static final ProtoAdapter<C02DZ> ADAPTER = new ProtoAdapter<C02DZ>() { // from class: X.027y
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02DZ decode(ProtoReader protoReader) {
            C02DZ c02dz = new C02DZ();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    if (iNextTag != 5) {
                                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                    } else {
                                        c02dz.schema = ProtoAdapter.STRING.decode(protoReader);
                                    }
                                } else {
                                    c02dz.select_status = ProtoAdapter.INT32.decode(protoReader);
                                }
                            } else {
                                c02dz.module_status = ProtoAdapter.INT32.decode(protoReader);
                            }
                        } else {
                            c02dz.content = C5431029t.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c02dz.title = C5431029t.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02dz;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02DZ c02dz) {
            C02DZ c02dz2 = c02dz;
            ProtoAdapter<C5431029t> protoAdapter = C5431029t.ADAPTER;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c02dz2.title) + protoAdapter.encodedSizeWithTag(2, c02dz2.content);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(3, c02dz2.module_status) + protoAdapter2.encodedSizeWithTag(4, c02dz2.select_status) + ProtoAdapter.STRING.encodedSizeWithTag(5, c02dz2.schema) + c02dz2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02DZ c02dz) {
        }
    };
    public C5431029t content;
    public Integer module_status;
    public String schema;
    public Integer select_status;
    public C5431029t title;

    public C02DZ() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C586002Qg newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
